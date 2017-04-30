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
	<h1 class="h1">Vehicle Information</h1>
	<h3 align="center" class="error">${errval}</h3>
	
	<div ALIGN="left">
		<form:form method="post" action="vehicle" commandName="vehicle">
			<table align="center">
				<tr height="20px"></tr>
				<tr>
					<td align="right"><span class="column">Vehicle Number:</span></td>
					<td><form:input path="vehnum" size="9"/></td>
					<td><form:errors path="vehnum" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Modal Year:</span></td>
					<td><form:input path="modelyear" /></td>
					<td><form:errors path="modelyear" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Make:</span></td>
					<td><form:input path="make" /></td>
					<td><form:errors path="make" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Model:</span></td>
					<td><form:input path="model" /></td>
					<td><form:errors path="model" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">VIN Number:</span></td>
					<td><form:input path="vinnumber" /></td>
					<td><form:errors path="vinnumber" cssClass="error" /></td>
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
