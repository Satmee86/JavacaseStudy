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
	<h1 class="h1">Coverage Information</h1>
	<h3 align="center" class="error">${errval}</h3>
	
	<div ALIGN="left">
		<form:form method="post" action="coverage"
			commandName="coverage">
			<table align="center">
				<tr height="20px"></tr>
				<tr>
					<td align="right"><span class="column">Coverage Type:</span></td>
					<td><form:select path="coveragetype">
							<form:option value="NONE"> --SELECT--</form:option>
							<form:option value="Liability"> Liability</form:option>
							<form:option value="Collision"> Collision</form:option>
							<form:option value="Comprehensive"> Comprehensive</form:option>
						</form:select></td>
					<td><form:errors path="coveragetype" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Vehicle Usage:</span></td>
					<td><form:select path="vehusageType">
							<form:option value="NONE"> --SELECT--</form:option>
							<form:option value="Personal"> Personal</form:option>
							<form:option value="Commercial"> Commercial</form:option>
						</form:select></td>
					<td><form:errors path="vehusageType" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Miles/Day:</span></td>
					<td><form:select path="milesday">
							<form:option value="NONE"> --SELECT--</form:option>
							<form:option value="5"> 5</form:option>
							<form:option value="10"> 10</form:option>
							<form:option value="15"> 15</form:option>
							<form:option value="20"> 20</form:option>
						</form:select></td>
					<td><form:errors path="milesday" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Liability Coverage:</span></td>
					<td><form:select path="liabilitycoverage">
							<form:option value="select"> --SELECT--</form:option>
							<form:option value="500">500</form:option>
							<form:option value="1000">1000</form:option>
							<form:option value="5000">5000</form:option>
							<form:option value="10000">10000</form:option>
						</form:select></td>
					<td><form:errors path="liabilitycoverage" cssClass="error" /></td>
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
