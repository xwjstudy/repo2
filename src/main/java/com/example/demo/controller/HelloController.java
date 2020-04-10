package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public static void main(String[] args){
        String aa = "";
        JSONObject parse = JSONObject.parseObject(aa);
        System.out.println(parse);
    }
    @GetMapping("/hello")
    public String hello()
    {
        return  "hello world";
    }
    @GetMapping("/hi")
    public String hi()
    {
        return  "hi world";
    }
    @GetMapping("/peace")
    public String peace()
    {
        return  "hi peace";
    }
    @GetMapping("/conflict")
    public String conflict()
    {
        return  "conflict world";
    }
    @GetMapping("/heihei")
    public String heihei()
    {
        return  "heihei world";
    }
    @GetMapping("/haha")
    public String haha()
    {
        return  "hi haha";
    }
}
