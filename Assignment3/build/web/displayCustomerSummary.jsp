<%-- 
    Document   : displayCustomerSummary.jsp
    Created on : 30-Sep-2017, 08:14:44
    Author     : forCSGOcozcantalttab
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <title>Customer Summary Information</title>
    </head>
    <body>
        <h1>Summary Customer Information </h1>
        <table>
            
            <thead><tr>
                    <th>Customer Number</th>
                    <th>Name</th>
                    <th>City</th>
                    <th>Credit Limit</th>
                    <th></th>
                </tr></thead>
            
            <tbody>
                <c:forEach var="customer" items="${customers}">
                    <tr>
                        <td>${customer.custNo}</td>
                        <td>${customer.name}</td>
                        <td>${customer.city}</td>
                        <td>${customer.creditLimit}</td>
                        <td>
                               <form method="post" action="displayCustomerDetails.jsp">
                                    <input type="hidden" name="id" value="${customer.getCustNo()}"/>
                                    <input type="submit" value="Details">
                             </form>
                            
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
