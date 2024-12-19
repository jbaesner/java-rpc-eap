package com.alizardo.remote;

import javax.ejb.Remote;

@Remote
public interface RemoteHello {
    String sayHello();
}
