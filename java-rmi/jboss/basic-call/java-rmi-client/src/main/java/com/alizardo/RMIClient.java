package com.alizardo;

import com.alizardo.shared.HelloRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

/**
 * Hello Java RMI Client
 */
public class RMIClient {
    public static void main(String[] args) {
        try {
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
            props.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");

            Context context = new InitialContext(props);
            HelloRemote myRmiService = (HelloRemote) context.lookup("java:global/RMIServer");

            String response = myRmiService.sayHello();
            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
