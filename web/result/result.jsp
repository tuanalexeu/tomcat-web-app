<%@ page import="java.util.*" %>
<html>
<body>
<h1 align=”center”>Beer Recommendations JSP</h1>
<p>
        <%
         List<String> styles = (List<String>) request.getAttribute("styles");
         for(String style: styles) {
            out.print("<br>try: " + style);
         }
        %>
</body>
</html>