<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.h1 {
	color: #006400;
	font-style: italic;
	font-weight: bold;
	text-align: center;
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
	margin-top: 75px; /* negative value of footer height */
	height: 150px;
	clear: both;
}

.button {
margin: 5px;
width: 85px;
height:auto;
display:inline-block;
}
</style>
<title>AutoQuote Application</title>
<script>
function goBack() {
    window.history.back()
}
</script>
</head>
<body bgcolor="#87CEEB">
	<img width=150px; height=130px; style="padding-bottom: 30px"
		src="<%=request.getContextPath()%>/resources/images/auto.jpg" />
	<h1 class="h1">Applicant Information</h1>
	<h3 align="center" class="error">${errval}</h3>
	<div ALIGN="left">
		<form:form method="post" action="applicant" commandName="applicant">
			<table align="center">
				<tr height="20px"></tr>
				<tr>
					<td align="right"><span class="column">First Name:</span></td>
					<td><form:input path="applfirstname" /></td>
					<td><form:errors path="applfirstname" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Middle Name:</span></td>
					<td><form:input path="applmidname" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Last Name:</span></td>
					<td><form:input path="appllastname" /></td>
					<td><form:errors path="appllastname" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Address Line 1:</span></td>
					<td><form:input path="appaddrline1" /></td>
					<td><form:errors path="appaddrline1" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Address Line 2:</span></td>
					<td><form:input path="appaddrline2" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">City:</span></td>
					<td><form:input path="city" /></td>
					<td><form:errors path="city" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">State:</span></td>
					<td><form:input path="state" size="2" /></td>
					<td><form:errors path="state" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Zip Code:</span></td>
					<td><form:input path="zipcode" size="5" /></td>
					<td><form:errors path="zipcode" cssClass="error" /></td>
				</tr>
				<tr height="20px"></tr>
				<tr>
					<td align="center"><button class="button" onclick="goBack()">Back</button></td>
					<td align="center"><input type="submit" name="Submit"
						class="button" id="Submit" value="Next" /></td>
				</tr>
			</table>

		</form:form>
</div>

</body>
</html>
