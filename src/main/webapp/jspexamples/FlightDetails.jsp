<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.dao.DatabaseConnector" %>
<%@ page import="java.sql.*"%>
<%!
static final Logger logger=Logger.getLogger("FlightDetails.jsp");
%>
<html>
<body>
FLIGHT_______________DETAILS
<br>
<%
    String fname=(String)request.getParameter("fname");
    String ffrom=(String)request.getParameter("ffrom");
    String fto=(String)request.getParameter("fto");
    String fprice=(String)request.getParameter("fprice");
%>
    <br><%=fname%>
   <br> <%=ffrom%>
    <br><%=fto%>
    <br><%=fprice%>
<%
    Connection conn = DatabaseConnector.getConnection();


     try
     {
               PreparedStatement stmt=conn.prepareStatement("insert into flightrecords values(?,?,?,?,?)");
               stmt.setInt(1,102);
               stmt.setString(2,fname);
                stmt.setString(3,ffrom);
                stmt.setString(4,fto);
                stmt.setString(5,fprice);
               int i=stmt.executeUpdate();


            }
            catch(Exception e){
            logger.error(e.getMessage(), e);
            }
%>
</body>
</html>