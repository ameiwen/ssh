package com.yaa.service.impl;

import com.yaa.dao.UserDao;
import com.yaa.model.User;
import com.yaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.saveUser(user);
    }
}
