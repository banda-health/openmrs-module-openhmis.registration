<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

<openmrs:require privilege="View Patients" otherwise="/login.htm" redirect="/findPatient.htm" />

<spring:message var="pageTitle" code="Pages.findPatient.title" scope="page"/>
<h2><spring:message code="Patient.search"/></h2>

<br />

<!-- Change to patient service in future -->
<openmrs:portlet id="findPatientPortlet" url="<%= ModuleWebConstants.PORTLET_PATIENT_FIND %>" parameters="size=full|postURL=patientDashboard.form|showIncludeVoided=false|viewType=shortEdit|patientService=DWRPatientService" />

<!-- Change to OpenHMIS add patient -->
<openmrs:hasPrivilege privilege="Add Patients">
    <br/> &nbsp; <spring:message code="general.or"/><br/><br/>
    <openmrs:portlet id="addPersonPortlet" url="<%= ModuleWebConstants.PORTLET_PATIENT_ADD %>" parameters="personType=patient|postURL=admin/person/addPerson.htm|viewType=shortEdit" />
</openmrs:hasPrivilege>

<%@ include file="/WEB-INF/template/footer.jsp" %>
