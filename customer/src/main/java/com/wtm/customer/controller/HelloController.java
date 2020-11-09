package com.wtm.customer.controller;

import com.wtm.customer.service.TestHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @Autowired
    private TestHelloService testHelloService;

    @RequestMapping("/getHello")
    @ResponseBody
    public String getHello(){
        return testHelloService.printHello();
    }
}
