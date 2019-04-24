package com.yy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/hello")
    public String sayHello(@RequestParam("name")String name){

        return name+",welcome to spring cloud world provider !";
    }
}
