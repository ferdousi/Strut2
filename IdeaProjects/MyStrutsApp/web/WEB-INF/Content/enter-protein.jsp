<%--
  Created by IntelliJ IDEA.
  User: saraferdousi
  Date: 2/23/17
  Time: 1:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>User Data </title>
</head>
<body>
<h1>Enter Protein</h1>
<s:form>
    <s:textfield name="enteredProtein" />
    <s:submit value="Enter" />
</s:form>
<div>Last amount entered:<s:property value="enteredProtein" /></div>
<div>Total for the day: 100 grams</div>
<div><s:property value="goalText" /></div>
</body>
</html>
