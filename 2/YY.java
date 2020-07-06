
import java.util.Scanner;
public class YY{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入a：");
	int a=input.nextInt();
	System.out.print("请输入b：");
	int b=input.nextInt();
	System.out.print("ax+b=0的解为:");
	double x=-b*1.0/a;
	System.out.print(x);	
        }
}