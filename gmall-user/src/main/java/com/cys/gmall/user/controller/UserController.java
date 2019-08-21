package com.cys.gmall.user.controller;

import com.cys.gmall.user.bean.UserMember;
import com.cys.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author JunA
 * @create 2019-08-20 19:42
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UserMember> getAllUser(){
        return userService.getAllUser();
    }

        @RequestMapping("/index")
        @ResponseBody
    public String index (){
        return "hellow world";
    }
}
