<%@ include file="/common/taglibs.jsp"%>

<div id="divider">
	<div></div>
</div>
<span class="left"> <c:if test="${pageContext.request.remoteUser != null}">
		<fmt:message key="user.status" /> ${pageContext.request.remoteUser}
        </c:if> </span>
<span class="right"> &copy; <fmt:message key="info.company" /> </span>
