<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<ul>
  <li><a href="home.jsp">Home</a></li>
  <li><a href="account.jsp">My Account</a></li>
  <li><a href="logoutSuccess.jsp">Logout</a></li>
</ul>

<h3>Home</h3>
<table id = "receiptListTable">
<s:iterator value = "receiptList">
<tr>
<td>Order ID: <s:property value = "orderID"/></td>
<td>$<s:property value = "price"/></td>
<td>Seller: <s:property value = "sellerName"/></td>
</tr>
</s:iterator>
</table>
</body>
</html>