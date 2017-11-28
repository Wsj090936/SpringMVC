<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/user/receiveId.do"
		method="post">
		id:<input type="text" name="id" /> <input type="submit" value="提交" />
	</form>
	<hr color="red" size="10">
	<form action="${pageContext.request.contextPath }/user/receiveUser.do"
		method="post">
		姓名:<input type="text" name="username" /> 
		密码:<input type="password" name="password" /> 
		生日:<input type="text" name="birthday" /> 
		<input type="submit" value="提交" />
	</form>
		<hr color="red" size="10">
	<form action="${pageContext.request.contextPath }/user/receiveUserExt.do"
		method="post">
		姓名:<input type="text" name="user.username" /> 
		密码:<input type="password" name="user.password" /> 
		生日:<input type="text" name="user.birthday" /> 
		<input type="submit" value="提交" />
	</form>
			<hr color="red" size="10">
	<form action="${pageContext.request.contextPath }/user/receiveArray.do"
		method="post">
		id:<input type="checkbox" name="arg" value="1"/> 
		id:<input type="checkbox" name="arg" value="2"/> 
		id:<input type="checkbox" name="arg" value="3"/> 
		<input type="submit" value="提交" />
	</form>
		<hr color="red" size="10">
	<form action="${pageContext.request.contextPath }/user/receiveList.do"
		method="post">
		姓名:<input type="text" name="userList[0].username" /> 
		密码:<input type="password" name="userList[0].password" /> 
		生日:<input type="text" name="userList[0].birthday" /><br/>
		
		姓名:<input type="text" name="userList[1].username" /> 
		密码:<input type="password" name="userList[1].password" /> 
		生日:<input type="text" name="userList[1].birthday" /> 
		<input type="submit" value="提交" />
	</form>
			<hr color="red" size="10">
	<form action="${pageContext.request.contextPath }/user/receiveMap.do"
		method="post">
		姓名:<input type="text" name="maps{'username'}" id="username"/> 
		密码:<input type="password" name="maps{'password'}" id="password"/> 
		生日:<input type="text" name="maps{'birthday'}" id="birthday"/> 
		<input type="submit" value="提交" />
	</form>
</body>
</html>