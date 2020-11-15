## 11. Spring事务支持
```xml
<!--    配置声明式事务-->

    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <constructor-arg ref="dataSource" />
    </bean>

<!--    结合AOP实现事务的织入-->
<!--    配置事务通知-->
    <tx:advice id="txAdvice" transaction-manager="transactionManager">
<!--        给哪些方法配置事务-->
<!--        配置事务的传播特性-->
        <tx:attributes>
            <tx:method name="add" propagation="REQUIRED"/>
            <tx:method name="delete" propagation="REQUIRED"/>
            <tx:method name="update" propagation="REQUIRED"/>
            <tx:method name="query" read-only="true"/>
            <tx:method name="*" propagation="REQUIRED"/>
        </tx:attributes>
    </tx:advice>

<!--    配置事务的切入
 com.kuang.mapper.*.*(..)下面的所有方法都会切入txAdvice事务
-->
    <aop:config>
        <aop:pointcut id="txPoint" expression="execution(* com.kuang.mapper.*.*(..))"/>
        <aop:advisor advice-ref="txAdvice" pointcut-ref="txPoint"/>
    </aop:config>
```
在没有切入上面的事务的时候
```java
 <insert id="addUser" parameterType="user">
        insert into mybatis.user (id, name, pwd) values (#{id}, #{name}, #{pwd})
    </insert>

    <delete id="deleteUser" parameterType="int">
        deletes from mybatis.user where id=#{id}
    </delete>
```
这里的deleteUser方法是写错的, 但是addUser也可以增加进去, 当时这是不符合事务的要求的.   
现在我们用aop实现事务的横切, 这样只要deleteUser是错的那么addUser就算执行了也会回滚.
