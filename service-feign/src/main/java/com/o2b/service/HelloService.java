package com.o2b.service;


import com.o2b.service.FallBackImpl.HelloFallBackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhuhaoju on 2017/12/25.
 */
@FeignClient(value = "eureka-client",fallback = HelloFallBackImpl.class)
public interface HelloService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam("name") String name);
}
