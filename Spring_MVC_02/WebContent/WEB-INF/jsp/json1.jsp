<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript">
	function requestJson(){
		var json = JSON.stringify({"username":汤姆,"age":"12"});
		$.ajax({
			type:post,
			url:'${pageContext.request.contextPath }/user/requestJson.do',
			contentType:'application/json;charset=utf-8',
			data:json,
			success:function(data){
				alert(data.username);
			}
		})
		
	}
</script>
<body>
<input type="button" onclick="requestJson()"/>
</body>
</html>