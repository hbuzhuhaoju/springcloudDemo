package com.o2b.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.o2b.service.HelloSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhuhaoju on 2017/12/22.
 */
@RestController
public class HelloController {

    @Autowired
    HelloSerivce helloSerivce;

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHello(String name){
        return  helloSerivce.sayHello(name);
    }

    public String hiError(String name){
        return "hi " + name + ",this is error";
    }

}
