<%-- 
    Document   : editProduit
    Created on : 13 mars 2023, 16:21:51
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World this is editProduit!</h1>
       
         <form action="../../produit/update/${articleFinded.id}" method="post">
            <table>
                <tr>
                    <td>designation</td>
                    <td><input type="text" name="designation" value="${articleFinded.getDesignation()}"></td>
                </tr>
                 <tr>
                    <td>prix</td>
                    <td><input type="text" name="prix" value="${articleFinded.getPrix()}"></td>
                </tr>
                 <tr>
                    <td>qte</td>
                    <td><input type="text" name="qte" value="${articleFinded.getQte()}"></td>
                </tr>
                 <tr>
                     <td><input type="reset" value="reset"></td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
            
    </body>
</html>
