<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<style>
.h1 {
	color: #006400;
	font-style: italic;
}

.error {
	color: #E74C3C;
	font-style: italic;
}

.column {
	color: black;
	font-weight: bold;
}

.footer {
	position: relative;
	margin-top: 250px; /* negative value of footer height */
	height: 150px;
	clear: both;
}
</style>
<title>Get your Auto Quote today!</title>
</head>
<body bgcolor="#87CEEB">
	<img width=150px; height=130px; style="padding-bottom: 30px"
		src="<%=request.getContextPath()%>/resources/images/auto.jpg" />
	<h1 align="center" class="h1">Get your Auto Quote today!</h1>
	<h3 align="center" class="error">${errval}</h3>
		<div align="center">

			<form:form method="post" action="login" commandName="login">

				<table align="center">
					<tr>
					</tr>
					<tr>
						<td><span class="column">Username:</span></td>
						<td><form:input path="username" /></td>
						<td><form:errors path="username" cssClass="error" /></td>
					</tr>
					<tr height="10px"></tr>
					<tr>
						<td><span class="column">Password:</span></td>
						<td><form:input path="password" /></td>
						<td><form:errors path="password" cssClass="error" /></td>
					</tr>
					<tr height="10px"></tr>
					<tr>
						<td></td>
						<td align="right"><input type="submit" name="Submit"
							id="Submit" value="Login"></td>
					</tr>
				</table>

			</form:form>
		</div>
		
</body>
</html>