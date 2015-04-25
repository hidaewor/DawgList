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
			<h3>ItemInfo</h3>
			
			<!-- Begin Item INFO -->
				<s:iterator value = "itemList">
				<h3><s:property value = "itemName"/>, Price: $<s:property value = "price"/><br/>
				Seller: <s:property value = "sellerName"/></h3><br/>
				<s:property value = "description"/>
				
				<s:url id="purchase" action="purchase">
				    <s:param name="itemID"><s:property value = "itemID"/></s:param>
				</s:url><br/>
				</s:iterator>
				<s:a href="%{purchase}">Purchase</s:a>
			<!-- End Item INFO -->
			
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
