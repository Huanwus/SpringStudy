package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*
@Configuration也会是Spring容器托管，注册到容器中，因为他本身就是一个@Component
@Configuration代表一个配置类，就和我们之前的beans.xml是一样的
所以也可以进行xml中的ComponentScan操作
 */
@Configuration
@ComponentScan("com.kuang")
@Import(kuangConfig2.class)
public class KuangConfig {
    /*
    注册一个bean，就相当于我们之前写的一个bean标签，
    这个方法的名字，就相当于bean标签中的id属性
    这个方法的返回值，就相当于bean标签的class属性
     */
    @Bean
    public User getUser(){
        return new User(); // 这就是要返回要注入到bean的对象！
    }
}
