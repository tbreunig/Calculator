<%-- 
    Document   : labOneOutput
    Created on : Jan 29, 2015, 1:54:34 AM
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
        <title>Lab One Output</title>
    </head>
    <body>
        
         <%
            String answer = "";
     
            Object result = request.getAttribute("result");
            
            
            if (result == null) {
                answer = "Whoops! No answer found. Please try again.";
        
            } else {
                
                Double d = (Double) result;
                answer = d.toString();
            }
            %>
             
        <p>The total area of your shape is: <%=answer%> </p>
  
    </body>
</html> 
