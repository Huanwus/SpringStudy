## 10.整合Mybatis
步骤:  
1. 导入相关jar包
 - junit
 - mybatis
 - mysql
 - spring
 - aop织入
 - mybatis-spring
 
2.编写配置文件  
3.测试
 #### 10.1 回忆mybatis
 1. 编写实体类
 2. 编写核心配置文件
 3. 编写接口
 4. 编写Mapper.xml
 5. 测试
 
 #### 10.2 Mybatis-Spring
 我们看看resources文件下的三个配置文件.  
 application-context.xml与spring-dao.xml是Spring的配置文件,  mybatis-config.xml是Mybatis的配置文件. 
 
 application-context.xml是总的Spring配置文件, spring-dao.xml专注于处理数据库这个配置文件就可以不要动它了.
 1. 编写数据源配置
 2. sqlSessionFactory. ->在基础的 MyBatis 用法中，是通过 SqlSessionFactoryBuilder 来创建 SqlSessionFactory 的。
 而在 MyBatis-Spring 中，则使用 SqlSessionFactoryBean 来创建。
 3. sqlSessionTemplate. ->  SqlSessionTemplate 是 MyBatis-Spring 的核心。作为 SqlSession 的一个实现，
 这意味着可以使用它无缝代替你代码中已经在使用的 SqlSession
 4. 需要给接口加实现类
 5. 将自己写的实现类注入到spring中
 6. 测试使用
 
 