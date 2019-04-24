package com.yy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//设定远程访问的服务名
@FeignClient(name = "eureka-provider")

public interface FeignService {
    //标识需要远程服务提供的访问接口
    @RequestMapping("/hello")
//    请求所需要携带的参数
    public String getInfo(@RequestParam("name") String name);
}
