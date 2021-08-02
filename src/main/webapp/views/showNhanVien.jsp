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
<a href="/views/createNhanVien.jsp">create</a>
<table>
    <c:forEach items="${listNV}" var="nv">
    <tr>
        <td>${nv.id}</td>
        <td>${nv.name}</td>
        <td>${nv.birthday}</td>
        <td>${nv.email}</td>
        <td>${nv.address}</td>
        <td>${nv.idPB}</td>
        <td><button >edit</button></td>
        <td><button >delete</button></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
