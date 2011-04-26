<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/common/taglibs.jsp"%>
<html>
<body>
试试中文
	<a href="${ctx }/user/add"><fmt:message key="info.user.add"/></a>
	<br>
	<a href="${ctx }/schedule">添加计划任务</a>
</body>
</html>
