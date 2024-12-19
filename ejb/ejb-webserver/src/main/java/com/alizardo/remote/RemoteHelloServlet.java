package com.alizardo.remote;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(value = "/RemoteHelloServlet")
public class RemoteHelloServlet extends HttpServlet {
    private Logger logger = Logger.getLogger(RemoteHelloServlet.class.getName());

    @Inject
    RemoteHello service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("GET /RemoteHelloServlet");
        resp.getWriter().println(service.sayHello());
    }
}
