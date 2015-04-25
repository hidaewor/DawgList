<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DawgList</title>
<link rel="stylesheet" href="css/style.css">
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
			<h3>Welcome to DawgList!</h3>
				<p> DawgList is your one stop for buying and selling items within your UGA! See what your fellow classmates are selling below.
				<h3>Current Listings</h3>
				<hr>
				<!--Begin Table of Items-->
					<table id = "itemList">
					<s:iterator value = "list">
					<tr>
					<td><s:url id="test" action="getDescription">
					    <s:param name="itemClicked"><s:property value = "itemID"/></s:param>
					</s:url>
					<s:a href="%{test}"><s:property value = "itemName"/></s:a></td>
					<td>$<s:property value = "price"/></td>
					<td>Seller: <s:property value = "sellerName"/></td>
					</tr>
					</s:iterator>
					</table>
				<!--End Table of Items-->
				<hr>
				<p><a href="postItem.jsp" class="btn">Post A Listing</a></p>
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