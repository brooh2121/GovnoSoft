<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Programs</h1>
<table border="2" width="70%" cellpadding="2">
    <tr><th>id</th><th>name</th><th>url</th><th>hash</th></tr>
    <c:forEach var="program" items="${list}">
    <tr>
        <td>${program.id}</td>
        <td>${program.name}</td>
        <td>${program.url}</td>
        <td>${program.hash}</td>
    </tr>
    </c:forEach>
</table>