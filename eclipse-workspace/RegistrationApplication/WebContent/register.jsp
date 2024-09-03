<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head/>
</head>
<body>
  <s:form action="registerAction">
  <s:textfield  name="firstName" label="First Name "> </s:textfield>
  <s:textfield  name="lastName" label="Last Name "> </s:textfield>
  <s:radio name= "gender" list="{'Male','Female'}" label="Gender" />
  <s:textfield name="age" label= "Age"></s:textfield>
  <s:textfield name="email" label = "Email"> </s:textfield>
  <s:submit value="Register"></s:submit>
  </s:form>
</body>
</html>