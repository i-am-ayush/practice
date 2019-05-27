<%@ page import="com.ExceptionBasic.*" %>
<html>
<body>
<h2>Hello World!</h2>

<%
        try{
        ExceptionThrower.throwException("ayush");
        }
        catch(Exception e){
            out.println(e);
        }
        %>
</body>
</html>
