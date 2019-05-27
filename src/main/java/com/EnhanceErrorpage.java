package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class EnhanceErrorpage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter p = resp.getWriter();
        String message;
        message = getServletConfig().getInitParameter("message");
        Exception e=(Exception)req.getAttribute("javax.servlet.jsp.jspException");
        p.println("<html>\n" +
                "<body>\n" +
                //    s +
                "<h2>Error happened</h2>\n");
        p.println(e.getMessage());
        p.println("</body>\n" +
                "</html>\n" );
    }
}
