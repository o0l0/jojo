<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<%@page import="java.sql.*"  %>
<%@page import="sjkjh.Query"%>
<%@page import="mybean.date.Fz"%>
<%@page import="java.util.List"%>
<%@page import="mybean.date.Fz"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../Goods" method="post" enctype="multipart/form-data">
<table align="center">
<caption>��Ʒ���</caption>

<tr><td>��Ʒ����</td><td><input type="text" name="good_name"></td></tr>
<tr><td>��Ʒ������</td><td><input type="text" name="good_made"></td></tr>
<tr><td>��Ʒ�۸�</td><td><input type="text" name="good_price"></td></tr>
<tr><td>��Ʒ��Ϣ</td><td><input type="text" name="good_message"></td></tr>
<tr><td>��Ʒ����</td><td><input type="text" name="good_sl"></td></tr>
<tr><td>��ƷͼƬ</td><td><input type="file" name="good_print"></td></tr>
<tr><td>��Ʒ����</td><td> <select name="id">

<%-- <%

int i;
String sql="select id,fz from userc";
Query query=new Query();
List<Fz> list=query.getForlist(Fz.class,sql);//���÷�װ���ݿ⣬�ı�bean��toString�����װ

for(Object s:list)

{
	Fz fz=new Fz();
	int id=fz.getId();
	System.out.print("******&&&&&&&&"+id);
	out.print("<option value="+id+">"+s+"<option>");
}
%>
</select>  --%>


<% 
Connection con;
	PreparedStatement ps;
	ResultSet rs;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (Exception e) {
		System.out.print("���������ɹ�����");
		e.printStackTrace();
	}	
	String uri="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";	
	String name="root";
	String password="zzl123";
	try {
		con=DriverManager.getConnection(uri,name,password);
		ps=con.prepareStatement("select * from userc");
		rs=ps.executeQuery();
		while(rs.next())
		{
		int id=rs.getInt(1);
		//System.out.print("****"+id);
		String fz=rs.getString(2);
		out.print("<option value="+id+">"+fz+"<option>");
		}
		
	} catch (Exception e2) {
		// TODO Auto-generated catch block	
		System.out.print("���ݿ����ӳɹ�");
		e2.printStackTrace();
	}
	

	%> 
</select>
</td></tr> 






<tr><td><input type="submit" value="���"></td><td><input type="reset" value="����"></td></tr>

</table>


</form>
</body>
</html>