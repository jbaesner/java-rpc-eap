package com.alizardo.remote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class RemoteHelloClient implements RemoteHello {

    public InitialContext createContext() throws NamingException {
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
        props.put(Context.PROVIDER_URL, "remote+http://127.0.0.1:8080");
        return new InitialContext(props);
    }

    public RemoteHello lookup(InitialContext context) throws NamingException {
        final String rcal = "ejb:/ejb-server/RemoteHello!com.alizardo.remote.RemoteHello";
        return (RemoteHello) context.lookup(rcal);
    }

    @Override
    public String sayHello() {
        try {
            final RemoteHello remote = lookup(createContext());
            final String result = remote.sayHello();

            System.out.println("sayHello succeed: " + result);
            return result;
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}
