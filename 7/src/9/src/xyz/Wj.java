package xyz;
import java.io.*;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class Wj{
	private static String message="";
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String filepath = input.next();
		File sourceFile = new File(filepath);
   //     File sourceFile = new File("D:\\eclipse\\java\\s11\\src\\s11\\Textfile.java");
     //   java.io.PrintWriter output = new java.io.PrintWriter(sourceFile.getPath());
		try {
			openFile(sourceFile.getPath());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        sourceFile.createNewFile();
        FileReader in=new FileReader(sourceFile.getPath());
        editFile(sourceFile.getPath());
           
	}
	private static void openFile(String s) throws Exception
	{
		
		
		FileReader in=new FileReader(s);
		
		char[] charArray=new char[1024];
		int len=0;
		StringBuffer sb=new StringBuffer();
		while((len=in.read(charArray))!=-1)
		{
			sb.append(charArray);
		}
		message=sb.toString();
		System.out.println("���ļ����ݣ�"+"\r\n"+message);
		in.close();
	}
	private static void editFile(String filePath)
	{
		if(message==" "&&filePath==null)
		{
			System.out.println("�����½��ļ����ߴ��ļ�");
			return ;
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫɾ��������:");
		String inputMessage=" ";
		inputMessage=sc.nextLine();
		message=message.replace(inputMessage, " ");
		System.out.println("�޸ĺ�����ݣ�"+"\r\n"+message);
	}
	

}

