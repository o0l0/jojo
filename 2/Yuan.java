//计算圆的面积,结果保留两位小数
import java.util.Scanner;
public class Yuan{
	public static void main(String[] args){
	System.out.print("请输入半径：");
	final double  PI=3.1415926;
	Scanner input=new Scanner(System.in);
	int r=input.nextInt();//输入圆的半径
	double s=((int)((PI*r*r+0.005)*100))/100.0;
	System.out.print("半径为"+r+"的圆的面积为"+s);
	}	
}
