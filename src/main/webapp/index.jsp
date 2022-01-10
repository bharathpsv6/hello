<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head lang="en" xmlns:th="http://www.thymeleaf.org">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>EId</th>
<th>ENAME</th>
</tr>
<tr th:each="emp : ${listemp}">
<td th:text="${emp.eid}"></td>
<td th:text="${emp.ename}"></td>
</tr>
</table>
</body>
</html>