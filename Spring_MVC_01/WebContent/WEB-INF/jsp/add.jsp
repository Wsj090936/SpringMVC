<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的第er个SpringMVC程序</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/command.do" method="post">
		姓名：<input type="text" name="username"><br/>
		密码：<input type="text" name="password"><br/>
		生日：<input type="text" name="birthday"><br/>
		<input type="submit" value="提交"><br/>
	</form>
</body>
</html>