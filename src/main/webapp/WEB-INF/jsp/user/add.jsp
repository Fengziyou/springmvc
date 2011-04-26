<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/common/taglibs.jsp"%>
<html>
<head>
<title>Spring MVC Demo 用户注册</title>
</head>
<body>
	<center>
		<form:form modelAttribute="user" method="post">
			<fieldset>
				<legend>用户注册</legend>
				<p align="left">
					<form:label for="name" path="name" cssErrorClass="error">Name</form:label>
					<form:input path="name" />
					<form:errors path="name" />
				</p>
				<p align="left">
					<form:label for="age" path="age" cssErrorClass="error">age</form:label>
					<form:input path="age" />
					<form:errors path="age" />
				</p>
				<p align="left">
					<form:label for="email" path="email" cssErrorClass="error">E-Mail</form:label>
					<form:input path="email" />
					<form:errors path="email" />
				</p>
				<p>
					<input type="submit" value='<fmt:message key="info.submit"/>' />
				</p>
			</fieldset>
		</form:form>
	</center>
</body>