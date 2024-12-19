package com.alizardo.http;

import com.alizardo.shared.HelloService;

import javax.ejb.Stateless;
import java.util.logging.Logger;

@Stateless
public class HelloServiceImpl implements HelloService {
    private Logger logger = Logger.getLogger(HelloServiceImpl.class.getName());

    public String sayHello() {
        logger.info("Call sayHello");
        return "Hello";
    }
}