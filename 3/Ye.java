import java.util.Scanner;
public class Ye{
	public static void main(String[] args){
	double s1,s2,p;
	int i;
	Scanner input=new Scanner(System.in);
	System.out.print("������a��");
	int a=input.nextInt();
	System.out.print("������b��");
	int b=input.nextInt();
	System.out.print("������c��");
	int c=input.nextInt();
	p=b*b-4*a*c;
	System.out.print("ax^2+bx+c=0�Ľ�Ϊ:");
	if(b*b-4*a*c>=0){
	s1=(-b+Math.sqrt(p))/(2.0*a);
	s2=(-b-Math.sqrt(p))/(2.0*a);
	System.out.print("������ֱ�Ϊ��"+s1+"��"+s2);
	}else{
	s1=(-b+Math.sqrt(-p))/(2.0*a);
	s2=(-b-Math.sqrt(-p))/(2.0*a);
	System.out.print("������ֱ�Ϊ��"+s1+"i"+"��"+s2+"i"+"    ע-1*-1=i");
	}	
        }
}