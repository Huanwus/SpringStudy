package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    // 我们传统的方法就是业务层调用DAO层,然后new一个UserDaoImpl

    //private UserDao userDao =  new UserDaoImpl();
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }


    public void getUser() {
        userDao.getUser();
    }
}
