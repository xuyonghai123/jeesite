package servlet;

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
        System.out.println("This is my First Servlet doGet Example");

        PrintWriter out = response.getWriter();
        out.println("Http :Hello Servlet");
        out.println("Http :This is my First doGet Servlet Example");
    }

    public void service(HttpServletRequest req, HttpServletResponse resp)throws  ServletException,IOException{
        doGet(req,resp);
        doPost(req,resp);
        System.out.println("调用service方法");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws  ServletException,IOException{
        System.out.println("Hello Servlet");
        System.out.println("This is my First Servlet doPost Example");

        PrintWriter out = response.getWriter();
        out.println("Http : Hello Servlet");
        out.println("Http :This is my First doPost Servlet Example");
    }

}
