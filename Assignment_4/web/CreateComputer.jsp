
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a Computer Record</title>
    </head>
    <body>

    <h1>Create a Computer record</h1>
    <form id="createComputerForm" action="CreateComputer" method="post">
    <table>
       <tr><td>Cpu</td><td><input type="text" id = "cpu" name="cpu" /></td></tr>
       <tr><td>Motherboard</td><td><input type="text" id = "motherboard" name="motherboard" /></td></tr>
       <tr><td>Memory</td><td><input type="text" id = "memory" name="memory" /></td></tr>
       <tr><td>Storage</td><td><input type="text" id = "storage" name="storage" /></td></tr>
       <tr><td>Gpu</td><td><input type="text" id = "gpu" name="gpu" /></td></tr>
       <tr><td>Pc Case</td><td><input type="text" id = "pccase" name="pccase" /></td></tr>
       <tr><td>Psu</td><td><input type="text" id = "psu" name="psu" /></td></tr>
   </table>
    <input type="submit" id="CreateComputer" value="Create Computer Record" />
    </form>
<a href="ListComputer"><strong>Go to List of Computers</strong></a>
</body>
</html>
