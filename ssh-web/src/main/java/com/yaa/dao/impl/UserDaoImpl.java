package com.yaa.dao.impl;

import com.yaa.dao.UserDao;
import com.yaa.model.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(rollbackFor = Exception.class)
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

    @Override
    public void saveUser(User user) {
        try {
            save(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
