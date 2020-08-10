<%--
  Created by IntelliJ IDEA.
  User: zaoyu
  Date: 2020/5/31
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ page session="false" %>
<html>
<head>
    <title>spittr.Spitter</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css" />" >
</head>
<body>

    <h1><s:message code="spittr.welcome"/> </h1>

    <s:url value="/spitter/spittles/{para}" var="registerUrl" scope="application" htmlEscape="true">
        <s:param name="max" value="60"/>
        <s:param name="count" value="5"/>
        <s:param name="para" value="1"/>
    </s:url>

    <a href="<c:url value="/spittles" />">Spittles</a>
    <s:url value="/spitter/spittles/"  htmlEscape="true" /> <!-- htmlEscape 不与 var 同时用 -->
    |
    <%--<a href="<c:url value="/spitter/register" />">Register</a>--%>
    <a href="${registerUrl}">Register</a>

</body>
</html>
