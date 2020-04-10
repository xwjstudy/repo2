package com.example.demo.webservice.impl;

import com.example.demo.webservice.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public String getHello(String name) {
        return "hello "+name;
    }
}