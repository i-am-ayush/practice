package com;
import com.dao.DatabaseConnector;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class QueryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    static int id=102;
    static final Logger logger= Logger.getLogger(QueryServlet.class);
    @Override
    public void init() throws ServletException {
        super.init();

    }

    // JDK 6 and above only
    // The doGet() runs once per HTTP GET request to this servlet.
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set the MIME type for the response message
        response.setContentType("text/html");
        // Get a output writer to write the response message into the network socket
        PrintWriter out = response.getWriter();
        id++;
        String bookname= (String) request.getParameter("bookname");
        String authorname= (String) request.getParameter("authorname");
        Connection conn = DatabaseConnector.getConnection();
         out.println("<html><head><body> ");
         out.println(bookname);
        out.println(authorname);
        out.println("</body></html>");
        try(Statement stmt=conn.createStatement()){
            String sqlStr = "insert into bookrecords values ("+id+",'"+bookname+"','"+authorname+"')";
            out.println("<html><head><title>Query Response</title></head><body>");
            out.println("<h3>Thank you for your query.</h3>");
            out.println("<p>You query is: " + sqlStr + "</p>"); // Echo for debugging
            stmt.execute(sqlStr);  // Send the query to the server
            logger.info(bookname + "added");
            out.println("</body></html>");
//            String sqlStr = "select * from bookrecords";
//            out.println("<html><head><title>Query Response</title></head><body>");
//            out.println("<h3>Thank you for your query.</h3>");
//            out.println("<p>You query is: " + sqlStr + "</p>"); // Echo for debugging
//            ResultSet rset=stmt.executeQuery(sqlStr);  // Send the query to the server
//            ResultSetMetaData rsmd = rset.getMetaData();.
//            int columnsNumber = rsmd.getColumnCount();
//            while (rset.next()) {
//                for (int i = 1; i <= columnsNumber; i++) {
//                    String columnValue = rset.getString(i);
//                    out.println(columnValue + " " + rsmd.getColumnName(i));
//                }
//                System.out.println("");
//            }
         //   out.println("</body></html>");
        } catch (SQLException ex) {
            logger.error(ex.getMessage(), ex);
        }

    }
}
