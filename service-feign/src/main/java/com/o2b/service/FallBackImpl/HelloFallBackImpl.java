package com.o2b.service.FallBackImpl;

import com.o2b.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhuhaoju on 2017/12/25.
 */
@Component
public class HelloFallBackImpl implements HelloService {

    @Override
    public String sayHello(@RequestParam("name") String name) {
        return "this is error, " + name;
    }
}
