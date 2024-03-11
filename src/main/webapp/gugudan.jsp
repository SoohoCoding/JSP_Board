<%--
  Created by IntelliJ IDEA.
  User: lch94
  Date: 2024-03-11
  Time: 오후 1:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int dan = Integer.parseInt(request.getParameter("dan"));
    int limit = Integer.parseInt(request.getParameter("limit"));
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1><%=dan%>단</h1>
        <% for (int i = 1; i <= limit; i++) { %>
            <div><%=dan%> * <%=i%> = <%=dan * i%></div>
        <% }%>

        }


</body>
</html>
