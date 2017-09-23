<%-- 
    Document   : displayList
    Created on : 23-Sep-2017, 13:43:21
    Author     : forCSGOcozcantalttab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assignment 2</title>
    </head>
    <body>
        <h1>Distribution List</h1>
        <div>
            <table><thead><strong>Email</strong></thead>
            <c:forEach var="email" items="${emailList}">               
                <tr>
                    <td><span>${email}</span></td>
                </tr>
            </c:forEach>
            </table>
                <div>
                 <p><a href='addUser.html'>Add another email to the list.</a></p>
                </div>
                
                <div>
                 <p><a href='index.jsp'>Back to index page.</a></p>
                </div>
        </div>
    </body>
</html>
