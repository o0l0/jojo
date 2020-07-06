//求两个数的平均值,结果保留两位小数
import java.util.Scanner;
public class Pjs{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("第一个数");
	double x=input.nextDouble();
	System.out.print("第二个数");
	double y=input.nextDouble();
	double s=(int)(((x+y)/2.0+0.005)*100)/100.0;
	System.out.print("这两个数的平均数是"+s);

		
        }
}