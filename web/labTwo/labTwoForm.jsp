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
        <%
            String answer = "";
            Object obj = request.getAttribute("result");
            if (obj == null) {
                answer = "Whoops! No answer found. Please try again.";
            } else {
                Double d = (Double) obj;
                answer = d.toString();
            }
        %>

        <h1>Area</h1>

        <form id="form1" name="form1" method="POST" action="<%= request.getContextPath()%>/calculatorController?action=calcSquare">
            <p>To find the area, please enter the length of one of the sides of the square in question:</p>
            <input type="text" name="squareSide">
            <input type="submit" name="submit" value="Calculate">
            <p>The answer is: <%= answer%> </p>
            <hr>
            <p>To find the area, please enter the length and width of the rectangle in question:</p>
            <input type="text" name="recSideLength">
            <input type="text" name="recSideWidth">
            <input type="submit" name="submit" value="Calculate">
            <p>The answer is: <%= answer%> </p>

        </form>    
    </body>
</html>
