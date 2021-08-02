<%--
  Created by IntelliJ IDEA.
  User: johntoan98gmail.com
  Date: 02/08/2021
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/nhanvien?action=create" method="post">
    <table>
        <tr>
            <td><input type="text" name="id" placeholder="nhập id"></td>
            <td><input type="text" name="name" placeholder="nhập name"></td>
            <td><input type="text" name="birthday" placeholder="nhập birthday"></td>
        </tr>
        <tr>
            <td><input type="text" name="email" placeholder="nhập email"></td>
            <td><input type="text" name="address" placeholder="nhập address"></td>
            <td><input type="text" name="idPB" placeholder="nhập idPB"></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Create Nhan viên</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
