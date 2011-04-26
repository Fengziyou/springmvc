<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/common/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="schedule">
<form:input path="name"/>
<form:errors path="name"/>
<input type="submit" value='<fmt:message key="form.next"/>' name="_eventId_next">
<input type="submit" value='<fmt:message key="form.cancel"/>' name="_eventId_cancel">
</form:form>
</body>
</html>