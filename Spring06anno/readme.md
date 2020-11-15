## 8.注解开发
```xml
  <!--    开启注解支持-->
    <context:annotation-config/>
<!--    扫面包下面的注解，使注解能够生效-->
    <context:component-scan base-package="com.kuang"/>
```
#### 1.bean  
@Component组件，放在类上，说明这个类被Spring管理了，就是Bean  
相当于<bean id="user" class="com.kuang.pojo.User"
#### 2.属性如何注入  
@Value("吴晗")  
相当于 
<property name="name" value="吴晗"/

#### 3.衍生的注解    
- @Component有几个衍生品，我们在web开发的过程中会按照MVC的架构进行开发
    - dao[Repository]
    - service[@Service]
    - controller[@Controller]  
这四个注解的功能是一样的，就是将类注册到Spring中装配Bean
#### 4.自动装配置  
@Autowire与@Resource这两个注解
#### 5.作用域  
@Scope("singleton")
#### 6.小结:XML与注解的优缺点

- XML更加万能，适合于任何场景，维护更加简单。
- 注解，不是自己类使用不了，维护相对复杂。

最佳实践，一般是xml管理bean，注解一般完成属性的注入。
