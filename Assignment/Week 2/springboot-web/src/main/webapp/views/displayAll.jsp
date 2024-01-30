<%@page import="com.hexaware.springbootweb.entity.Employee"%>
<%@page import="java.util.List"%>
<h1> Display All </h1>

Hello I am JSP

<%


List<Employee> list = (List<Employee>) session.getAttribute("empList");
out.println(list);


%>