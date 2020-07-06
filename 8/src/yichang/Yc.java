package yichang;
import java.util.Scanner;
public class Yc{
public static void main(String[] atgs)throws Exception 
{
	
	
	System.out.println("输入被除数");Scanner x=new Scanner(System.in);
	int x1=x.nextInt();
	System.out.println("输入除数");
	int x2=x.nextInt();
	Yc qz=new Yc();
	
	try {
		double s=qz.qf(x1,x2);
		System.out.println(s);
	}catch(Exception e)
	{
		e.printStackTrace();
	}finally
	{
		System.out.println("除数不能为零");
	}
	
}
public double qf(int x,int y)throws Exception
{
	double s=x*1.0/y;
	return s;
}
}