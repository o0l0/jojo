<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  type="text/css" href="cS01.css"/>
</head>
<body>
<form action="" method="get">
<div><table align="center">
<tr>
	<td>用户名:</td>
	<td><input type="text" name="name" value="冲冲冲"/></td>
</tr>

<tr>
	<td>密码:</td>
	<td><input type="password" name="password" value="嘤嘤嘤"/></td>
</tr>

</div><tr>
	<td>性别:</td>
	<td><input type="radio" name="sex" value="boy"/></td>
	<td><input type="radio" name="sex" value="girl"></td>
</tr>

<tr>
	<td>爱好:</td>
	<td><input type="checkbox" name="love" value="打游戏"/>打游戏</td>
	<td><input type="checkbox" name="love"  value="快乐水">快乐水</td>
	<td><input type="checkbox" name="love"  value="喜羊羊">喜羊羊</td>
</tr>

<tr>
	<td>国籍:</td>
	<td><select>
		<option>---请选择籍贯---</option>
		<option selected="selected">福建</option>
		<option>云南</option>
		<option>北京</option>
	</select></td>
</tr>

<tr>
	<td>我的理想:</td>
	<td><textarea rows="20" cols="40">这个社会，这种程度的你跟我讲理想？？！！！</textarea></td>
</tr>

<tr>
	<td><input type="reset" value="重置" onclick="onclickFun();"></td>
	<td><input type="submit" value="提交" id="b1"/></td>
</tr>

</table>
</div>
</form>
</body>
</html>