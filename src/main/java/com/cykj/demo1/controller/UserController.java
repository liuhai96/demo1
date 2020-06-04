package com.cykj.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @RequestMapping("/getUser")
    public String getUser(String username){
        System.out.println("----------rab");
        return "username:"+username;
    }
}
