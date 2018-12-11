<%--
  Created by IntelliJ IDEA.
  User: Pham Dat
  Date: 12/11/2018
  Time: 11:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form method="post" action="result">
    <table>
        <tr>
            <td><input type="text" name="numberOne" value="${numberOne}"></td>
            <td><input type="text" name="numberTwo" value="${numberTwo}"></td>
        </tr>
    </table>

    <input type="submit" value="Addition(+)" name="add">
    <input type="submit" value="Subtraction(-)" name="sub">
    <input type="submit" value="Multiplication(X)" name="mul">
    <input type="submit" value="Division(/)" name="div">

</form>
Result ${ap}: ${result}.
</body>
</html>

