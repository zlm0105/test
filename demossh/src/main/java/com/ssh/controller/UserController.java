package com.ssh.controller;

import com.ssh.enity.User;
import com.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhanglm@sdhuijin.cn
 * @date: 2020-07-08 16:37
 **/
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/findall")
    public  List<User> findAll(){
        List<User> all = userService.findAll();
        return all;
    }
}
