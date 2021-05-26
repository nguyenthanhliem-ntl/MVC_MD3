<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 26/05/2021
  Time: 8:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Danh sach</title>
</head>
<body>
<h2>Danh sach</h2>
<table>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>price</td>
        <td>action</td>
    </tr>
    < c:forEach items="${listdanhsach}" var ="helo">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td><a href="/product?action=edit&id=${helo.id-1}">edit</a> </td>
            <td><a href="/product?action=delete&id=${helo.id-1}">delete</a> </td>
        </tr>

    < /:c:forEach>
</table>
</body>
</html>
