<%-- 
    Document   : Hello
    Created on : 11 mars 2023, 17:58:17
    Author     : dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World this is MvcPojectConfiguration!</h1>
        <table border="1">
            <tr>
                <td>Id</td>
                <td>designation</td>
                <td>prix</td>
                <td>qte</td>
                <td><a href="../MvcPojectConfiguration/produit/create">add new</a></td>
                
            </tr>
            <c:forEach var="row" items="${articles}">
            <tr>
                <td>${row.id}</td>
                <td>${row.designation}</td>
                <td>${row.prix}</td>
                <td>${row.qte}</td>
                <td><a href="../MvcPojectConfiguration/produit/destroy/${row.id}">delete</a></td>
                <td><a href="../MvcPojectConfiguration/produit/edit/${row.id}">edit</a></td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
