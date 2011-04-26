<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ include file="/common/taglibs.jsp"%>
<html>
<head>
<%@ include file="/common/meta.jsp"%>
<title><decorator:title default="springmvc" /> | <fmt:message key="info.title" />
</title>

<decorator:head />
</head>
<body>
	<%@ include file="/common/header.jsp"%>
	<%@ include file="/common/messages.jsp"%>
	<decorator:body />
	<hr>
		<%@ include file="/common/footer.jsp"%>
</body>
</html>
