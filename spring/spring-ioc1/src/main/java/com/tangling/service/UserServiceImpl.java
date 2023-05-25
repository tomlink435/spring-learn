package com.tangling.service;

import com.tangling.dao.UserDao;
import com.tangling.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();

    public void getUser(){

        userDao.getUser();
    }

}
