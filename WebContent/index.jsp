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
<h3>Home</h3>
<s:iterator value = "list">
<fieldset>
<s:property value = "id"/><br/>
<s:property value = "sellerName"/><br/>
<s:property value = "category"/><br/>
<s:property value = "price"/><br/>
<s:property value = "itemCondition"/><br/>
<s:property value = "description"/><br/>
</fieldset>
</s:iterator>
</body>
</html>