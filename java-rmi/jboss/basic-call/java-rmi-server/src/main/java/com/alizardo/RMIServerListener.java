package com.alizardo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * {@link RMIServerListener} invokes the {@link RMIServerBinder} on the startup
 */
public class RMIServerListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Init RMIServer");
        RMIServerBinder.bind();
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Shutting down RMIServer");
    }
}