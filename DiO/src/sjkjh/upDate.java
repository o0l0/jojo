package sjkjh;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class upDate {
	public void upDate(String sql,Object ...args) 
	{
		//��ȡ���ݿ�����
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con = sjklj.getConnection();
	
		//Ԥ����
		 ps = con.prepareStatement(sql);
		if(args!=null){
		for(int i=0;i<args.length;i++)
		{
			ps.setObject(i+1, args[i]);
			System.out.print(args[i]);
		}
		ps.executeUpdate();
		
		}else System.out.print("����Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sjklj.closeResourec(con, ps);
		}
	}
}
