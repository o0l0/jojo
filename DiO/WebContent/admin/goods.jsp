<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ page import="com.sun.rowset.*" %>
<%@ page import="sjkjh.Query" %>
<%@ page import="mybean.date.Fz" %>
<%@ page import="java.sql.*" %>
<jsp:useBean id="fyy" class="mybean.date.FenYe" scope="session"/><!-- 分页类可以用同一个，不过servlet内取名要不同 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 

<title>Insert title here</title>
</head>
<body>
<center>


<jsp:setProperty property="dqpage" name="fyy" param="change"/>
<jsp:setProperty property="dSpage" name="fyy" param="text"/>
<table border="1" width="100px" align="center">
<tr><td>商品id</td><td>商品名称</td><td>制造商</td><td>价格</td><td>详细信息</td><td>数量</td><td>图片</td><td>类别</td><td>删除</td></tr>

<%

boolean boo=true;
int DSpage=fyy.getdSpage();//每页
int Zgpage=fyy.getZgpage();//总共
int Dqpage=fyy.getDqpage();//当前
CachedRowSetImpl rs=fyy.getRowset();
if(rs==null){
	//out.print("没有查询到记录");
	boo=false;
	return;
}
rs.last();
int Zghpage=rs.getRow();
if(Zghpage%DSpage==0)
{
	Zgpage=Zghpage/DSpage;
	//System.out.print(Zgpage);
}else
	Zgpage=Zghpage/DSpage+1;
fyy.setZgpage(Zgpage);

if(Zgpage>=1)
	if(fyy.getDqpage()<1)
		fyy.setDqpage(fyy.getZgpage());
	if(fyy.getDqpage()>fyy.getZgpage())
		fyy.setDqpage(1);



int index=(fyy.getDqpage()-1)*DSpage+1;
rs.absolute(index);


//	out.print("对管理员进行操作时请勿点击与页面有关的内容");
	for(int i=index;i<index+DSpage&&boo;i++)
	{
	
		String good_id=rs.getString(1);
		String good_name=rs.getString(2);
		String good_made=rs.getString(3);
		Float good_price=rs.getFloat(4);
		String good_message=rs.getString(5);		
		int good_sl=rs.getInt(6);
		String good_print=rs.getString(7);
		int id=rs.getInt(8);
	//	out.print("----"+id+"-----");
	//	out.print("++++"+good_id+"++++");
	String delete="<form action='../deletefzsp' method='post'>"+"<input type='hidden' name='id' value="+good_id+" />"+"<input type='submit' value='删除'/>"+"</form>";
	//String update="<form action='update.jsp' method='post'>"+"<input type='hidden' name='name' value="+name+" />"+"<input type='hidden' name='pwd' value="+pwd+" />"+"<input type='submit' value='更新'/>"+"</form>";
	out.print("<tr>");
	out.print("<td>"+good_id+"</td>");
	out.print("<td>"+good_name+"</td>");
	out.print("<td>"+good_made+"</td>");
	out.print("<td>"+good_price+"</td>");
	out.print("<td>"+good_message+"</td>");
	out.print("<td>"+good_sl+"</td>");
	out.print("<td>"+good_print+"</td>");

	
	Connection con;
	PreparedStatement ps;
	ResultSet rst;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (Exception e) {
		System.out.print("加载驱动成功！！");
		e.printStackTrace();
	}	
	String uri="jdbc:mysql://localhost:3306/wdnmd?useSSL=false&serverTimezone=UTC";	
	String name="root";
	String password="zzl123";
	try {
		con=DriverManager.getConnection(uri,name,password);
		ps=con.prepareStatement("select * from userc where id=?");
		ps.setInt(1,id);
		rst=ps.executeQuery();
		if(rst.next())
		{
		
		//System.out.print("****"+id);
		String fz=rst.getString(2);
		out.print("<td>"+fz+"</td>");
		}
		
	} catch (Exception e2) {
		// TODO Auto-generated catch block	
		System.out.print("数据库连接成功");
		e2.printStackTrace();
	}
	 
	
	out.print("<td>"+delete+"</td>");
    // out.print("<td>"+update+"</td>");
	out.print("</tr>");
	boo=rs.next();
	}

	
	
 
%>

</table>

<br/>
每页显示<jsp:getProperty property="dSpage" name="fyy"/>条记录
<br/>
当前是第<jsp:getProperty property="dqpage" name="fyy"/>页,总共有<jsp:getProperty property="zgpage" name="fyy"/>页记录
<br/>
<table>
<tr>
<td><form action=""><input type="hidden" name="change" value="<%=fyy.getDqpage()-1%>"/><input type="submit" value="上一页"/> </form> </td>
<td><form action=""><input type="hidden" name="change" value="<%=fyy.getDqpage()+1%>"/><input type="submit" value="下一页"/></form> </td>
</tr>
<tr>
<td> <form action="">每页显示 <input type="text" name="text" value="" size="3"  />条记录<input type="submit" value="确定"/>  </form> </td>
<td> <form action="">输入页码 <input type="text" name="change" value="" size="3"  /><input type="submit" value="确定"/>  </form> </td>
</tr>


</table>








</center>
</body>
</html>