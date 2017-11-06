<%-- 
    Document   : ListComputers
    Created on : 06-Nov-2017, 18:56:16
    Author     : Andre Godinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Of Computers</title>
    </head>
    <body>

    <h1>List of Computers</h1>
  
<table id="computerListTable" border="3">
<tr >
    <th bgcolor=>ID</th>
    <th bgcolor=>Cpu</th>
    <th bgcolor=>Motherboard</th>
    <th bgcolor=>Memory</th>
    <th bgcolor=>Storage</th>
    <th bgcolor=>Gpu</th>
    <th bgcolor=>Case</th>
    <th bgcolor=>Psu</th>
    
</tr>
<c:forEach var="computer" begin="0" items="${requestScope.computerList}">
<tr>
    <td>${computer.pkId}&nbsp;&nbsp;</td> 
    <td>${computer.cpu}&nbsp;&nbsp;</td>
    <td>${computer.motherboard}&nbsp;&nbsp;</td>
    <td>${computer.memory}&nbsp;&nbsp;</td>
    <td>${computer.storage}&nbsp;&nbsp;</td>
    <td>${computer.gpu}&nbsp;&nbsp;</td>
    <td>${computer.pccase}&nbsp;&nbsp;</td>
    <td>${computer.psu}&nbsp;&nbsp;</td>
    <td>
          <form method="post" action="EditComputer.jsp">
                                    <input type="hidden" name="pkId" value="${computer.pkId}"/>
                                    <input type="hidden" name="cpu" value="${computer.cpu}"/>
                                    <input type="hidden" name="motherboard" value="${computer.motherboard}"/>
                                    <input type="hidden" name="memory" value="${computer.memory}"/>
                                    <input type="hidden" name="storage" value="${computer.storage}"/>
                                    <input type="hidden" name="gpu" value="${computer.gpu}"/>
                                    <input type="hidden" name="pccase" value="${computer.pccase}"/>
                                    <input type="hidden" name="psu" value="${computer.psu}"/>
                                    <input type="submit" value="Edit">
                           </form>
    </td>
    <td>
        <form method="post" action="DeleteComputer">
            <input type="hidden" name="pkId" value="${computer.pkId}"/>
            <input type="submit" value="Delete">
        </form>
    </td>
    
</tr> 
</c:forEach>
</table>
<a href="CreateComputer.jsp"><strong>Create a Computer Record</strong></a>
</body>
</html>
