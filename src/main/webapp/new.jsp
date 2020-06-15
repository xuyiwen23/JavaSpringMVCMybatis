<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/user" method="post">
	    new user：<br/>
	    name：<input type="text" name = 'name'><br/>
	    性别：<input type="radio" name = 'gender' value='0'>男
	    	  <input type="radio" name = 'gender' value='1'>女
	    <br/>
	    <input type ="submit" value = "保存">
	</form>
</body>
</html>