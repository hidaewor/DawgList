<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="html" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/form-style.css">
</head>
<body>
<!-- Start Page Content -->
<div class="content">
	<div class="container">
		<div class="main">
		
			<!-- Begin LOGIN FORM -->
			<h3>DawgList Login</h3>
			<!--<a href="<s:url action='goToRegister'/>">Register</a> -->
			<p align="center">Not yet registered? <a href = "registerPage.jsp">Click Here.</a></p>
			
			<form action="login" class="basic-grey">
			      <!-- i dont think this is needed: <label for="customerEmail"> -->
			      <label>
				      <span>Username:</span>
				      <input type="text" name="customerUsername"/>
			      </label>
			      <label>
				      <span>Password:</span>
				      <input type="password" name="customerPass"/>
			      </label>
			      <label>
			      	  <span>&nbsp;</span> 
			      	  <input type="submit" class="button" value="Login"/>
			      </label>
			</form>
   			<!-- End LOGIN FORM -->
   			<span>&nbsp;</span> 
			<p align="center"><img src="imgs/georgia.gif"></p>
			
		</div>
	</div>
</div>
<!-- End Page Content -->	  
</body>
</html>