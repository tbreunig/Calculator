<%-- 
    Document   : labOneOutput
    Created on : Jan 29, 2015, 1:54:34 AM
    Author     : Tyler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab One Output</title>
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
        
        <p>The area of your square is: <%= answer%> </p>
        
        <hr>
        
         <p>The area of your rectangle is: <%= answer%> </p>        
        
    </body>
</html>
