<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<h1>WELCOME TO JSP</h1>

<%
int x = 100;

LocalDate date = LocalDate.now();
LocalTime time = LocalTime.now();

out.println(x);
out.println(date);
out.println(time);

%>

