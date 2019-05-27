<%! int pageCount=0;
public void addCount(){
    pageCount++;
}
%>
<%@ include file="Expression.jsp" %>
<jsp:include page="Expression.jsp"/>
<html>
<body>
<%
    out.println(application.getInitParameter("admin-email"));
    addCount();
%>
page count is <%=pageCount%>
<h2>Hello World!</h2>
</body>
</html>
