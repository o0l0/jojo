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
<caption>�޸�����</caption>
<tr><td width="150px">�û���</td><td width="150px"><input  type="text" value="<%=name%>"    name="text"/></td></tr>
<tr><td>������</td><td><input  type="password" value="<%=pwd%>" name="oldmm"/></td></tr>
<tr><td>������</td><td><input  type="password" name="newmm"/></td></tr>
<tr><td><input  type="submit" value="����"/></td><td><input  type="reset" value="ȡ��"/></td></tr>
</table>

</form>

</body>
</html>