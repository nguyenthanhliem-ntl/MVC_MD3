<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 26/05/2021
  Time: 8:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>form sửa </h2>
<form method="post" action="/product?action=edit&id=${product.id}" />
<input name=" name" value="${product.name}">
<input name=" submit" value="${product.price}">
<input type="submit" value="Edit">
</form>
</body>
</html>
