package com.alizardo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * From <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/hello/hello-world.html">Getting Started Using Java RMI - Oracle</a>
 */
public interface HelloRemote extends Remote {
    String sayHello() throws RemoteException;
}