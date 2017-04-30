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

function closeWin() {
	window.close();
}
</script>
</head>
<body bgcolor="#87CEEB">
	<img width=150px; height=130px; style="padding-bottom: 20px"
		src="<%=request.getContextPath()%>/resources/images/auto.jpg" />
	<h1 class="h1">Quote Information</h1>
	<br>
	<br>
	<h3 align="center" class="error">${errval}</h3>
	<div ALIGN="left">
			<table align="center">
				<tr>
				<td>Thank you for submitting auto quote with us, we will get back to you soon.</td>
				</tr>
				<tr height="10px"></tr>
				<tr>
				<td><span>Please note your Quote number for reference: <b class="error">${quoteNum}</b></span></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
				<td><span>Value of the quote is: $<b class="error">${quotedPrem}</b></span></td>
				</tr>
				<tr height="40px"></tr>
				<tr>
					<td align="center"><span><button class="button" onclick="goBack()">Back</button>
					<button class="button" onclick="window.close()">Close</button>
					</span></td>	
				</tr>
			</table>
	</div>
</body>
</html>
