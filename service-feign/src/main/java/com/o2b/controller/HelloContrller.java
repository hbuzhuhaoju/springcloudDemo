package com.o2b.controller;

import com.o2b.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuhaoju on 2017/12/25.
 */
@RestController
public class HelloContrller {

    @Autowired
    public HelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHello(String name){
        return helloService.sayHello(name);
    }
}
