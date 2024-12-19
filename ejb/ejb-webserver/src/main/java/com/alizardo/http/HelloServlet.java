package com.alizardo.http;

import com.alizardo.shared.HelloService;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(value = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    private Logger logger = Logger.getLogger(HelloServlet.class.getName());

    @Inject
    HelloService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("GET /HelloServlet");
        resp.getWriter().println(service.sayHello());
    }
}