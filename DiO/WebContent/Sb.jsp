<%@ page language="java" contentType="text/html; charset=gb2312"%>
<jsp:useBean id="DL" class="mybean.date.DengLu" scope="session"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
�û���<jsp:getProperty property="name" name="DL"/>��������<jsp:getProperty property="password" name="DL"/>��������<a href="denglu.jsp">�˴����µ�¼</a>
</body>
</html>