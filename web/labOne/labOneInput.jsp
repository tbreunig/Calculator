<%-- 
    Document   : areaOfASquare
    Created on : Jan 26, 2015, 9:06:43 PM
    Author     : Tyler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shape Calculators</title>
    </head>
    <body>

        <%--Move this line of code to later labs for JSTL use and for flexibility reasons--%>
        <%-- <c:set var="context" value="${pageContext.request.contextPath}" /> --%> 
        <%--<%= request.getContextPath()%>
            <%= request.getContextPath()%> --%>
        
        <h1>Area Calculations</h1>

        <form id="form1" name="form1" method="POST" action="../calculatorController?action=calcSquare">
            <p>To find the area, please enter the length of one of the sides of the square in question:</p>
            <input type="text" name="lengthOfSquareSide" placeholder="#'s only">
            <input type="submit" name="submit" value="Calculate">
        </form> 

        <hr>

        <form id="form2" name="form2" method="POST" action="../calculatorController?action=calcRectangle">
            <p>To find the area, please enter the length and width of the rectangle in question:</p>
            <input type="text" name="lengthOfRecSide" placeholder="Length">
            <input type="text" name="widthOfRecSide" placeholder="Width">
            <input type="submit" name="submit" value="Calculate">
        </form>     

    </body>
</html>
