package com.yaa.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yaa.model.User;
import com.yaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.UUID;


@Controller
public class UserAction extends ActionSupport {

    @Autowired
    private UserService userService;


    public String saveUser(){
        User user = new User();
        user.setName(UUID.randomUUID().toString());
        user.setAge(1);
        user.setSex("m");
        userService.save(user);
        return SUCCESS;
    }


}
