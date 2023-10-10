<%@ page contentType="text/html; charset=UTF-8"%>

<html>
<head>
  <title>Index JSP</title>
</head>
<body>
<h1>Test</h1>
<p>
  <%
    java.util.Date now = new java.util.Date();
    String s = "Текущая дата: " + now;
  %>
  <%= s %>
</p

<p>
  <%
    for (int i = 0; i < 5; i++) {
      out.println("<p>" + "N: " + i + "</p>");
    }
  %>
  <%@ page import="java.util.Date, javaee.MyClass"%>
  <% MyClass mc = new MyClass(); %>
  <%= new Date() %>
  <%= mc.showInfo() %>
</p>

<p>
  <%String name = request.getParameter("name");%>
  <%= "Hello " + name %>
</p>

<h1><%= "Hello All!" %></h1>
<br/>
<a href="servlet">Servlet</a>
</body>
</html>