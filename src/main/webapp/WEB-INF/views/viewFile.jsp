<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage Student</title>

<link href="<c:url value='/rs/css/style.css'/>" />
</head>
<body>
	<p>File</p>
	<p>File name: ${ file.getOriginalFilename()}</p>
</body>
</html>