package Yhxt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Xwj {
	public void wj(String s,String s2) throws IOException
	{
		File wj=new File(s);
		FileWriter wj2=new FileWriter(wj);
		wj2.write(s2);
		wj2.close();
	}

	public Xwj() {
		// TODO Auto-generated constructor stub
	}

}
		
	
