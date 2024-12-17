package com.alizardo;

import com.alizardo.shared.HelloRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * {@link RMIServer} implements the remote method {@link HelloRemote}
 */
public class RMIServer extends UnicastRemoteObject implements HelloRemote {
    public RMIServer() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello!";
    }
}
