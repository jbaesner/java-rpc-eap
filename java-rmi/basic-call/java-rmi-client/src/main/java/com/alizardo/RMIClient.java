package com.alizardo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Hello Java RMI Client
 * From <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/hello/hello-world.html">Getting Started Using Java RMI - Oracle</a>
 */
public class RMIClient {
    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            HelloRemote stub = (HelloRemote) registry.lookup("HelloRemote");
            String response = stub.sayHello();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
