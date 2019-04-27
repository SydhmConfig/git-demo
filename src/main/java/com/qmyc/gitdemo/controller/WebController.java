package com.qmyc.gitdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("WebController")
@Controller
public class WebController {


    @RequestMapping("hello")
    @ResponseBody
    public String helloGit(){
        System.out.println("hello");

        return "hello";
    }

}
