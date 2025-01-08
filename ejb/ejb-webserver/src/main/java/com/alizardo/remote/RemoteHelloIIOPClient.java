package com.alizardo.remote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

/**
 * Remote Hello Client using IIOP
 */
public class RemoteHelloIIOPClient implements RemoteHello {

    public InitialContext createContext() throws NamingException {
        Properties props = new Properties();
        // use this for weblogic - weblogic
        //props.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        // use this for weblogic - jboss
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.cosnaming.CNCtxFactory");
        props.put(Context.PROVIDER_URL, "corbaloc::localhost:3528/JBoss/Naming/root");
        return new InitialContext(props);
    }

    public RemoteHello lookup(InitialContext context) throws NamingException {
        //final String rcal = "ejb:/ejb-server/RemoteHello!com.alizardo.remote.RemoteHello";
        final String rcal = "RemoteHello";
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
