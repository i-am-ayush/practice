<%@ page import="org.apache.log4j.Logger" %>

<%!
static final Logger logger=Logger.getLogger("loggercheck.jsp");

%>
<%

logger.info("abcdef");
logger.debug("adsd");
logger.error("asdads");

%>