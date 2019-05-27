package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.setHeader("ads", "okqokqokoqk");
        req.setAttribute("name", "java");
        //resp.setContentLength(30);
        // String s=req.getParameter("first_name");
        req.getSession();
        resp.setContentType("text/html");
        ServletContext sc=getServletConfig().getServletContext();
        String email=sc.getInitParameter("admin-email");
        // resp.setHeader("Refresh","5;http://www.google.com");
        PrintWriter p = resp.getWriter();
        String message;
        message = getServletConfig().getInitParameter("message");
        Enumeration e = req.getHeaderNames();
        p.println("<html>\n" +
                "<body>\n" +
                //    s +
                "<h2>Hello World!!!!!</h2>\n");
        while (e.hasMoreElements()) {
            p.println(e.nextElement());
        }


        p.println("</body>\n" +
                "</html>\n" + email);
        p.println(Concurrent.getCount());
        // resp.sendRedirect("http://www.google.com");
       // req.getRequestDispatcher("/practice2").include(req, resp);
    }


}
