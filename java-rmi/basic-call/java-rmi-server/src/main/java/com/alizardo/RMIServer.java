package com.alizardo;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * RMI Server
 * From <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/hello/hello-world.html">Getting Started Using Java RMI - Oracle</a>
 */
public class RMIServer implements HelloRemote {
    public static void main(String[] args) {
        try {
            RMIServer obj = new RMIServer();
            HelloRemote stub = (HelloRemote) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("HelloRemote", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello!";
    }
}
