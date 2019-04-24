package com.yy.controller;

import com.yy.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private FeignService feignService;
    @RequestMapping("/login")
    @ResponseBody
    public String logins(@RequestParam("name") String name){

        return feignService.getInfo(name);
    }
}
