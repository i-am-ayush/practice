<%@ page isErrorPage="true" %>
<html>
<body>
This is an error page!!!!!!!!!!!!!!!!!!!!!
<%
out.println(exception.getMessage());
%>
</body>
</html>