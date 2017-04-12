package com.thinkgem.jeesite.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Thinkpad on 17/04/11.
 **/
public class Aservlet extends HttpServlet {
    public void init() throws ServletException{
        System.out.println("init()初始化了。。。。。。。。。。。");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException,IOException{
        System.out.println("Hello Servlet");
        System.out.println("This is my First Servlet Example");

        PrintWriter out = response.getWriter();
        out.println("Hello Servlet");
        out.println("This is my First Servlet Example");
    }

}
