package com.alizardo.remote;

import com.alizardo.shared.RemoteHelloService;

import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

@Stateless
public class RemoteHelloServiceImpl implements RemoteHelloService {
    @Override
    public String sayHello() {
        try {
            Properties p = new Properties();
            p.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
            p.put(Context.PROVIDER_URL, "remote+http://localhost:8080");
            InitialContext context = null;
            context = new InitialContext(p);

            final String rcal = "ejb:ejb-server/ejb//RemoteHelloServer!com.alizardo.shared.RemoteHelloService";
            final RemoteHelloService remote = (RemoteHelloService) context.lookup(rcal);
            final String result = remote.sayHello();

            System.out.println("sayHello succeed: " + result);
            return result;
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}
