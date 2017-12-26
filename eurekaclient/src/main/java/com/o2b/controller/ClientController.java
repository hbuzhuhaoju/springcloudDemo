package com.o2b.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuhaoju on 2017/12/21.
 */
@RestController
public class ClientController {


    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(String name){
        return "hi "+name+",i am from port:" +port;
    }
}
