package com.alizardo;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

/**
 * {@link RMIServerBinder} binds the {@link RMIServer} implementation to the JNDI service
 */
public class RMIServerBinder {
    public static void bind() {
        try {
            RMIServer rmiServer = new RMIServer();
            Context context = new InitialContext();
            context.bind("java:global/RMIServer", rmiServer);
            System.out.println("Bind JNDI service to java:global/RMIServer");
        } catch (RemoteException | NamingException e) {
            e.printStackTrace();
        }
    }
}
