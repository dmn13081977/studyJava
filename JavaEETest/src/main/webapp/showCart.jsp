<%@ page import="javaee.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 09.10.2023
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShowCart</title>
</head>
<body>
<% Cart cart = (Cart) session.getAttribute("cart"); %>
<p> Наименование товара: <%= cart.getItemName() %> </p>
<p> Количество товара: <%= cart.getQuantity() %> </p>
</body>
</html>
