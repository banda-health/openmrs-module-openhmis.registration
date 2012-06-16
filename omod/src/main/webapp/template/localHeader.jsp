<%@ page import="org.openmrs.module.openhmis.registration.*" %>

<spring:htmlEscape defaultHtmlEscape="true" />
<ul id="menu">
	<li class="first">
		<a href="${pageContext.request.contextPath}/admin">
			<spring:message code="openhmis-registration.title.short" />
		</a>
	</li>
	<li	<c:if test='<%= request.getRequestURI().contains("/manage") %>'>class="active"</c:if>>
		<a href="${pageContext.request.contextPath}<%= ModuleWebConstants.FORM_CONFIGURE_MODULE %>">
			<spring:message code="openhmis-registration.title" />
		</a>
        <a href="${pageContext.request.contextPath}<%= ModuleWebConstants.FORM_CONFIGURE_PATIENT_SEARCH%>">
            <spring:message code="openhmis-registration.title" />
        </a>
	</li>
	
	<!-- Add further links here -->
</ul>
<h2>
	<spring:message code="openhmis-registration.title" />
</h2>
