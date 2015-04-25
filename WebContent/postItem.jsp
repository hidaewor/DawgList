<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post A Listing</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/form-style.css">
</head>
<body>
<!-- Start Body -->

<!-- Start Header-->
<div class="header">
	<div class="container">
		<h1 class="header-heading">Dawg<b>List</b></h1>
	</div>
</div>
<!-- End Header -->

<!-- Start Navigation Bar -->
<div class="nav-bar">
	<div class="container">
		<ul class="nav">
			<li><s:url id="url" action="selectItem">
			</s:url>
			<s:a href="%{url}" >Home</s:a></li>
			<li><a href="account.jsp">My Account</a></li>
		  	<li><a href="logoutSuccess.jsp">Logout</a></li>
		</ul>
	</div>
</div>
<!-- End Navigation Bar-->

<!-- Start Page Content -->
<div class="content">
	<div class="container">
		<div class="main">
			<h3>New Listing</h3>
			<!-- Begin LOGIN FORM -->
			   <form action="postItem" class="basic-grey">
			      <label>
			      	<span>Your Name:</span>
			      	<input type="text" name="sellerName"/>
			      </label>
			      <label>
			      	<span>Your Email:</span>
			      	<input type="text" name="sellerEmail"/>
			      </label>
			      <label>
			      	<span>Item Name:</span>
			      	<input type="text" name="itemName"/>
			      </label>
			      <label>
			      	<span>Item Category:</span>
			      	<input type="text" name="category"/>
			      </label>
			      <label>
			      	<span>Item Price:</span>
			      	<input type="text" name="price"/>
			      </label>
			      <label>
			      	<span>Item Condition:</span>
			      	<input type="text" name="itemCondition"/>
			      </label>
			      <label>
			      	<span>Item Description:</span>
			      	<input type="text" name="description"/>
			      </label>
			      <label>
			      	<span>&nbsp;</span>
			      	<input type="submit" class="button" value="Submit"/>
			      </label>
			   </form>
			<!-- End LOGIN FORM -->
		</div>
	</div>
</div>
<!-- End Page Content -->

<!-- Start Footer -->
<div class="footer">
	<div class="container">
		&copy; Copyright 2015: Hope Idaewor, Avery Horton, Bee Yang
	</div>
</div>
<!-- End Footer -->

<!-- End Body -->
</body>
</html>
