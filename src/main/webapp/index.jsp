<html>
<body>
<h2>Hello World!</h2>
<%!
    int a = 2;
    int b = 3;
    int c;
%>
<%
    c = a + b;
    System.out.println(c);
//    out.write("");
    Object obj = session.getAttribute("myObj");
    if(obj != null && obj instanceof String){
        out.write((String)obj);
    } else {
        session.setAttribute("myObj", "my String");
    }
    response.addCookie(new Cookie("myCookie", "cookie value"));
%>
<%= c + a %>
</body>
</html>
