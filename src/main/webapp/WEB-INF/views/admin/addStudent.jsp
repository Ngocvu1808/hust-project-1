<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage Student</title>

<link href="<c:url value='/rs/css/style.css'/>" />
</head>
<body> --%>
	<p>User Info Addition</p>
	<c:url value="/admin/addStudent" var = "url"/>
	<form:form modelAttribute="user" method="post" action="${url }" >
		<p>Name: </p><form:input path="name"/>
		<p style="color: red;"><form:errors path="name"></form:errors></p>
		<p>Password: </p><form:password path="password"/>
		<p style="color: red;"><form:errors path="password"></form:errors></p>
		<p>Telephone number: </p><form:input path="telephonr_number"/>
		<p>Date of birth: </p><form:input path="dateOfBirth"/>
		<p>Email address: </p><form:input path="email"/>
		<p style="color: red;"><form:errors path="email"></form:errors></p>
		<p> Gender: </p> <form:select path="gender">
				<form:option value="Male">Male</form:option>
				<form:option value="Female">Female</form:option>
		</form:select>
		
		<button type="submit">Submit</button>
	</form:form>
<!-- </body>
</html> -->

<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage Student</title>

<link href="<c:url value='/rs/css/style.css'/>" />
</head>
<body>
	<p>User Info Addition</p>
	<c:url value="/admin/edit" var = "url"/>
	<form:form modelAttribute="user" method="post" action="${url }" >
		<form:hidden path="id"/>
		<p>Name: </p><form:input path="name"/>
		<p style="color: red;"><form:errors path="name"></form:errors></p> 
		<p>Telephone number: </p><form:input path="telephonr_number"/>
		<p>Date of birth: </p><form:input path="dateOfBirth"/>
		<p>Email address: </p><form:input path="email"/>
		<p style="color: red;"><form:errors path="email"></form:errors></p>
		<p> Gender: </p> <form:select path="gender">
				<form:option value="Male">Male</form:option>
				<form:option value="Female">Female</form:option>
		</form:select>
		
		<button type="submit">Submit</button>
	</form:form>
</body>
</html> --%>