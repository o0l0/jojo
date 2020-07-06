<%@ page language="java" contentType="text/html; charset=gb2312"%>
<jsp:useBean id="DL" class="mybean.date.DengLu" scope="session"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
用户名<jsp:getProperty property="name" name="DL"/>或者密码<jsp:getProperty property="password" name="DL"/>错误！请点击<a href="denglu.jsp">此处重新登录</a>
</body>
</html>