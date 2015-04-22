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
<a href="postItem.jsp">Post A Listing</a>
</body>
</html>