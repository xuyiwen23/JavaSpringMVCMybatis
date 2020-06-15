<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>user index</p>
	<table>
		<c:forEach items="${userList}" var="user">
			<tr> 
				<td>${user.id}</td>
	    	    <td>${user.name}</td>
	        	<td>${user.gender==0? '男' : '女'}</td>
	        	<td><a href="${pageContext.request.contextPath }/user/${user.id}">update</a></td>
	        	<td> 
		        	<form action="${pageContext.request.contextPath }/user/${user.id}" method="post">
				        <input type="hidden"  name="_method" value="DELETE"/>
				        <input type="submit" value="delete">
				    </form>
			    </td>
	    	</tr>
		</c:forEach>
		
	</table>
	<a href="new.jsp">create user</a>
</body>
</html>