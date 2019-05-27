package com;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.*;
import javax.servlet.ServletException;

public class DemoFilter implements Filter {
    FilterConfig congig;
    public void init(FilterConfig congig) throws ServletException {
        this.congig=congig;
    }

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {

        PrintWriter out = resp.getWriter();
        if(congig.getInitParameter("construction").equals("yes")){
            chain.doFilter(req, resp);
        }
        else{
            out.print("username or password error!");
            RequestDispatcher rd = req.getRequestDispatcher("jspexamples/ErrorPage");
            rd.include(req, resp);
        }
//        String password = req.getParameter("password");
//        if (password.equals("admin")) {
//            chain.doFilter(req, resp);//sends request to next resource
//        } else {
//            out.print("username or password error!");
//            RequestDispatcher rd = req.getRequestDispatcher("jspexamples/ErrorPage");
//            rd.include(req, resp);
//        }
    }
        public void destroy () {
        }

    }

