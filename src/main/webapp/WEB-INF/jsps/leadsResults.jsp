<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c" %>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
	<a href="/crmapp/viewleadpage">Create New Lead</a>
	<h1>All Leads</h1><br><hr><br>
	<table border=3>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last  Name</th>
			<th>E-Mail</th>
			<th>Lead Source</th>
			<th>Mobile</th>
		</tr>
		<c:forEach var="lead" items="${leads}">
			<tr>
				<td>${lead.id}</td>
				<td><a href="getLeadById?id=${lead.id}">${lead.firstname}</a></td>
				<td>${lead.lastname}</td>
				<td>${lead.email}</td>
				<td>${lead.leadsource}</td>
				<td>${lead.mobile}</td>
			</tr>
 		</c:forEach>
	</table>
	
</body>
</html>