package com.alizardo.remote;

import javax.ejb.Remote;

@Remote
public interface RemoteHelloService {
    String sayHello();
}
