<%-- 
    Document   : index
    Created on : 23-Sep-2017, 12:26:16
    Author     : forCSGOcozcantalttab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assignment 2</title>
    </head>
    <body>
<!--    if theres an empty string in the session object which is returned by
        checklist servlet then print it else nothing is printed-->
        <%
        if(session.getAttribute("empty")!= null){
        String listEmpty = (String)session.getAttribute("empty");
        %>
        <h1> 
        <% out.println(listEmpty);
        %>
        </h1>
        <%
//            setting the session variable empty to null so it doesnt print out list is empty
//            even when theres already a list
            session.setAttribute("empty", null);
        }
        %>
        
        <h1><a href="checkList">Get the distribution list</a></h1>
        <h1><a href="addUser.html">Add an email to the list.</a></h1>
    </body>
</html>
