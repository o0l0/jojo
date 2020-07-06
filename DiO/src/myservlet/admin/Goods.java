package myservlet.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybean.date.FenYe;
import mybean.date.goodsbean;
import sjkjh.Query;
import sjkjh.upDate;
import utils.FileUploadUtils;
import utils.IdUtils;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
import com.sun.rowset.CachedRowSetImpl;

import org.apache.commons.beanutils.BeanUtils;
public class Goods extends HttpServlet {
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("servlet里面");
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out=response.getWriter();
			goodsbean goods = new goodsbean();
			HashMap<String, String> map = new HashMap<String,String>();
			map.put("good_id", IdUtils.getUUID());
			DiskFileItemFactory df = new DiskFileItemFactory();
			df.setRepository(new File("d://.temp"));
			df.setSizeThreshold(1024*1024*10);
			ServletFileUpload upload = new ServletFileUpload(df);
			upload.setHeaderEncoding("gb2312");
			try{
				List<FileItem> items=upload.parseRequest(request);
				for(FileItem   item:items)
				{	if( item.isFormField())
					{
					String fileName= item.getFieldName();
					String value= item.getString("gb2312");
					map.put(fileName, value);
				 	}else
				 	{
				 		String fileName=item.getName();
				 		fileName=FileUploadUtils.subFileName(fileName);
				 		String randomName=FileUploadUtils.generateRandonFileName(fileName);
				 		File parentDir=new File("d:/images/");
				 		if(!parentDir.exists())
				 		{
				 			parentDir.mkdir();
				 		}
				 		String good_print="d://images"+"/"+randomName;
				 		map.put("good_print", good_print);
				 		IOUtils.copy(item.getInputStream(), new FileOutputStream(new File(parentDir,randomName)));
				 		item.delete();
				 		//System.out.print(map);
				 	}
				 	}
			}catch(Exception e){System.out.print(e);}
				try{
					BeanUtils.populate(goods, map);
				}catch(Exception e){
				}
				
				String good_id=goods.getGood_id();
				String good_name=goods.getGood_name();
				String good_made=goods.getGood_made();
				Float good_price=goods.getGood_price();
				String good_message=goods.getGood_message();
				//System.out.print("======"+good_message);
				int good_sl=goods.getGood_sl();
				String good_print=goods.getGood_print();
				int id=goods.getId();
				System.out.print("======"+id);

				
				
				String sql="insert into goods values(?,?,?,?,?,?,?,?)";
				upDate update = new upDate();
				update.upDate(sql,good_id,good_name,good_made,good_price,good_message,good_sl,good_print,id);
				out.print("<script>alert('插入成功！！！');window.location.href='admin/addGoods.jsp'</script>");
				
				
				
				
			}
	}


