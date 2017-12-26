package com.o2b.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhuhaoju on 2017/12/22.
 */

@Service
public class HelloSerivce {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHello(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello?name=" + name,String.class);
    }

}
