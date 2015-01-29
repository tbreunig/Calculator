<%-- 
    Document   : areaOfASquare
    Created on : Jan 26, 2015, 9:06:43 PM
    Author     : Tyler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculators</title>
    </head>
    <body>

        <h1>Area</h1>

        <form id="form1" name="form1" method="POST" action="<%= request.getContextPath()%>/CalculatorController?action=calcSquare">
            <p>To find the area, please enter the length of one of the sides of the square in question:</p>
            <input type="text" name="lengthOfSide">
            <input type="submit" name="submit" value="Calculate">
        </form> 
            
        <hr>
        
        <form id="form2" name="form2" method="POST" action="<%= request.getContextPath()%>/CalculatorController?action=calcRectangle">
            <p>To find the area, please enter the length and width of the rectangle in question:</p>
            <input type="text" name="lengthOfSide">
            <input type="text" name="widthOfSide">
            <input type="submit" name="submit" value="Calculate">
        </form>    
    </body>
</html>
