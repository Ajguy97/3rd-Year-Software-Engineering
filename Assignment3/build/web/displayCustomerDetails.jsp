<%-- 
    Document   : displayCustomerDetails
    Created on : 30-Sep-2017, 08:54:46
    Author     : forCSGOcozcantalttab
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <title>Customer Details</title>
    </head>
    <body>
       

        <c:forEach var="customer" items="${customers}">
            <c:if test="${param.id eq customer.custNo}">
                <h1>Customer Detail: ${customer.name}</h1>
                <table>
                    <tr>
                        <th>Contact</th>
                        <td>${customer.contact}</td>
                    </tr>

                    <tr>
                        <th>Phone</th>
                        <td>${customer.phoneNo}</td>
                    </tr>

                    <tr>
                        <th>Address</th>
                        <td>${customer.addressLine1}<br>
                            ${customer.addressLine2}<br>
                            ${customer.city}<br>
                            ${customer.state}<br>
                            ${customer.postalCode}<br>
                            ${customer.country}<br>
                        </td>
                    </tr>


                </table>
            </c:if>
        </c:forEach>

    </body>
</html>
