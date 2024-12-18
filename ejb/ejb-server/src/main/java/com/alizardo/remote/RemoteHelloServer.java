package com.alizardo.remote;

import javax.ejb.Stateless;

@Stateless
public class RemoteHelloServer implements RemoteHelloService {

    @Override
    public String sayHello() {
        return "Hello from RemoteHelloServer";
    }
}
