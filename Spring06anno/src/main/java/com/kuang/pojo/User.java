package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Component等价于<bean id="user" class="com.kuang.pojo.User"/>
@Component
public class User {
    @Value("吴晗")
    public String name;
}
