<%-- 
    Document   : EditComputer
    Created on : 06-Nov-2017, 22:24:15
    Author     : forCSGOcozcantalttab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
       
    <h1>Edit Computer Details:</h1>
    <form id="createComputerForm" action="EditComputer" method="post">
    <table>
       <input type="hidden" name="pkId" id="pkId" value="${param.pkId}"/>
       <tr><td>Cpu</td><td><input type="text" id = "cpu" name="cpu" style="width: 300px;" value="${param.cpu}" /></td></tr>
       <tr><td>Motherboard</td><td><input type="text" id = "motherboard" name="motherboard" style="width: 300px;" value="${param.motherboard}"/></td></tr>
       <tr><td>Memory</td><td><input type="text" id = "memory" name="memory" style="width: 300px;" value="${param.memory}"/></td></tr>
       <tr><td>Storage</td><td><input type="text" id = "storage" name="storage" style="width: 300px;" value="${param.storage}"/></td></tr>
       <tr><td>Gpu</td><td><input type="text" id = "gpu" name="gpu" style="width: 300px;" value="${param.gpu}"/></td></tr>
       <tr><td>Pc Case</td><td><input type="text" id = "pccase" name="pccase" style="width: 300px;" value="${param.pccase}"/></td></tr>
       <tr><td>Psu</td><td><input type="text" id = "psu" name="psu" style="width: 300px;" value="${param.psu}"/></td></tr>
   </table>
    <input type="submit" id="EditComputer" value="Edit Computer Record" />
    </form>   
    </body>
</html>
