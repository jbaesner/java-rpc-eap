package com.alizardo.remote;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Remote Hello Servlet using WebLogic T3
 */
@WebServlet(value = "/RemoteHelloIIOPServlet")
public class RemoteHelloIIOPServlet extends HttpServlet {
    private Logger logger = Logger.getLogger(RemoteHelloIIOPServlet.class.getName());

    @Inject
    RemoteHelloIIOPClient service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("GET /RemoteHelloIIOPServlet");
        resp.getWriter().println(service.sayHello());
    }
}
