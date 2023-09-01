MLA jsp...

<%@page import="com.jbk.basicspringmvcproject1.Mla" %>

<%
Mla mla=(Mla)request.getAttribute("data");
out.println(mla);
%>


