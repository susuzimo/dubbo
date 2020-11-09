package com.wtm.customer.service.implService;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wtm.customer.service.TestHelloService;
import com.wtm.provider.service.HelloService;
import org.springframework.stereotype.Service;

@Service("testHelloService")
public class ImplTestHelloService implements TestHelloService {

    @Reference
    private HelloService helloService;

    @Override
    public String printHello() {
        return helloService.printHello();
    }
}
