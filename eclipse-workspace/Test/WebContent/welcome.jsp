<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form action="TestAction">
  <s:textfield name="firstName" label="Your Name "> </s:textfield>
  <s:submit  value="Submit"> </s:submit>
</s:form>
</body>
</html>