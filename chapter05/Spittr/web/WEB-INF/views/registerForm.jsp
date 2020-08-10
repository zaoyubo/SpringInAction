<%--
  Created by IntelliJ IDEA.
  User: zaoyu
  Date: 2020/6/1
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Register</h1>

    <sf:form method="POST" modelAttribute="spitter">
        <sf:errors path="*" element="div" cssClass="errors"/>
        <sf:label path="firstName" cssErrorClass="error">First Name：</sf:label> <sf:input path="firstName" /><br/>
<%--        <sf:errors path="firstName" cssClass="error" /><br/>--%>
        Last Name: <sf:input path="lastName" /><br/>
        Email: <sf:input path="email" type="email"/><br/>
        Username: <sf:input path="username" /><br/>
        Password: <sf:password path="password" /><br/>
        <input type="submit" value="Register" />
    </sf:form>
</body>
<style type="text/css">
    div.errors {
        background-color: #ffcccc;
        border: 2px solid red;
    }
    .error {
        color: red;
    }
</style>
</html>
