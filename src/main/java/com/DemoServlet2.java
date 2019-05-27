package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        //  resp.setHeader("ads","okqokqokoqk");
        //resp.setContentLength(30);
        String s = req.getParameter("first_name");
        resp.setContentType("text/html");
        String path=((File)getServletContext().getAttribute("javax.servlet.context.tempdir")).getPath();

        ServletContext sc=getServletConfig().getServletContext();
        String email=sc.getInitParameter("admin-email");
        // req.getRequestDispatcher("basic2.html").forward(req,resp);
        // resp.setHeader("Refresh","5;http://www.google.com");
        PrintWriter p = resp.getWriter();
        p.println(path);
        String message;
        message = getServletConfig().getInitParameter("message2");
        //Enumeration e=req.getHeaderNames();
        p.println("<html>\n" +
                "<body>\n" +req.getAttribute("name")+
                "<h2>Hello World!!!!!</h2>\n" + message + s +email);
//        while(e.hasMoreElements()){
//        p.println(e.nextElement());
//        }


        p.println("</body>\n" +
                "</html>\n");
        // resp.sendRedirect("http://www.google.com");
    }

}
