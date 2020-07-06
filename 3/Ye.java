import java.util.Scanner;
public class Ye{
	public static void main(String[] args){
	double s1,s2,p;
	int i;
	Scanner input=new Scanner(System.in);
	System.out.print("请输入a：");
	int a=input.nextInt();
	System.out.print("请输入b：");
	int b=input.nextInt();
	System.out.print("请输入c：");
	int c=input.nextInt();
	p=b*b-4*a*c;
	System.out.print("ax^2+bx+c=0的解为:");
	if(b*b-4*a*c>=0){
	s1=(-b+Math.sqrt(p))/(2.0*a);
	s2=(-b-Math.sqrt(p))/(2.0*a);
	System.out.print("两个解分别为："+s1+"和"+s2);
	}else{
	s1=(-b+Math.sqrt(-p))/(2.0*a);
	s2=(-b-Math.sqrt(-p))/(2.0*a);
	System.out.print("两个解分别为："+s1+"i"+"和"+s2+"i"+"    注-1*-1=i");
	}	
        }
}