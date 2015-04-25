<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/form-style.css">
</head>
<body>
<!-- Start Page Content -->
<div class="content">
	<div class="container">
		<div class="main">
			<h3>DawgList Register</h3>
			
			<!-- Begin LOGIN FORM -->
			<form action="register" class="basic-grey">
				<label>
					<span>Username:</span>
				    <input type="text" name="customerUsername"/>
			    </label>
		      <label>
					<span>Email:</span>
					<input type="text" name="customerEmail"/>
			  </label>
			  <label>
			 	 <span>Password:</span>
		      	 <input type="password" name="customerPass"/>
		      </label>
		      <label>
			  	<span>&nbsp;</span> 
		      	<input type="submit" class="button" value="Register"/>
		      </label>
		   </form>
		   <!-- End LOGIN FORM -->
		   <span>&nbsp;</span> 
		   <p align="center"><a href="index.jsp"> Back To Login</a></p>
		   <p align="center"><img src="imgs/georgia.gif"></p>
		</div>
	</div>
</div>
<!-- END Page Content -->
</body>
</html>