<%@ page language="java" contentType="text/html; charset=gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
</head>
<body >
<%
request.setCharacterEncoding("gb2312");
String name=request.getParameter("name");
String pwd=request.getParameter("pwd");
%>
<form action="../update" method="post">
<table border="1" align="center">
<caption>修改密码</caption>
<tr><td width="150px">用户名</td><td width="150px"><input  type="text" value="<%=name%>"    name="text"/></td></tr>
<tr><td>旧密码</td><td><input  type="password" value="<%=pwd%>" name="oldmm"/></td></tr>
<tr><td>新密码</td><td><input  type="password" name="newmm"/></td></tr>
<tr><td><input  type="submit" value="更新"/></td><td><input  type="reset" value="取消"/></td></tr>
</table>

</form>

</body>
</html>