<%-- 
    Document   : createProduit
    Created on : 13 mars 2023, 15:50:03
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
        <h1>Hello World this is create produit!</h1>
        
        <form action="../produit/store" method="post">
            <table>
                <tr>
                    <td>designation</td>
                    <td><input type="text" name="designation"></td>
                </tr>
                 <tr>
                    <td>prix</td>
                    <td><input type="text" name="prix"></td>
                </tr>
                 <tr>
                    <td>qte</td>
                    <td><input type="text" name="qte"></td>
                </tr>
                 <tr>
                     <td><input type="reset" value="reset"></td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
            
            
            
            
            
        </form>
    </body>
</html>
