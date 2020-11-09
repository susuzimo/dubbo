package com.wtm.provider.service.implService;

import com.alibaba.dubbo.config.annotation.Service;
import com.wtm.provider.service.HelloService;

@Service
public class ImplHelloService implements HelloService {
    @Override
    public String printHello() {
        System.out.println("成功调用");
        return "hello";
    }
}
