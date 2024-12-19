package com.alizardo.remote;

import javax.ejb.Stateless;

@Stateless (name = "RemoteHello")
public class RemoteHelloBean implements RemoteHello {

    @Override
    public String sayHello() {
        return "Hello from RemoteHelloServer";
    }
}
