<html>
<body>
this is bean example!!!!!
<jsp:useBean id="date" class="java.util.Date" />
the date is <%= date %>
<jsp:useBean id="tom" class="com.BeanPractice" />
<%
tom.setAge(10);
tom.setName("Tom");
%>
 <jsp:setProperty name="tom" property="name" value="Mike"/>

Hello <jsp:getProperty name="tom" property="name"/> welcome to this page!!
</body>
</html>