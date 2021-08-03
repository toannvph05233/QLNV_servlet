<%--
  Created by IntelliJ IDEA.
  User: johntoan98gmail.com
  Date: 02/08/2021
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/nhanvien?action=create">create</a>
<table>
    <c:forEach items="${listNV}" var="nv" varStatus="loop">
    <tr>
        <td>${nv.id}</td>
        <td>${nv.name}</td>
        <td>${nv.birthday}</td>
        <td>${nv.email}</td>
        <td>${nv.address}</td>
        <td><c:if test="${nv.idPB==1}">Bảo vệ</c:if> <c:if test="${nv.idPB==2}">Vệ sinh</c:if></td>
        <td><a href="/nhanvien?action=edit&index=${loop.index}">edit</a></td>
        <td><a href="/nhanvien?action=delete&id=${nv.id}" >delete</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
