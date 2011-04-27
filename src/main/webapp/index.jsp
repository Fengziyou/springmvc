<%@ page language="java" isErrorPage="true" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
    if (request != null)
    {
        response.sendRedirect(request.getContextPath() + "/main");
        return;
    }
%>
<html>
	<head>
		<title>Go to SuccezBI</title>
	</head>
	<body>
		<strong><a href="<%= request.getContextPath() %>/main">Click here!</a></strong> to go to SuccezBI.
    </body>
</html>