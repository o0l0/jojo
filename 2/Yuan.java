//����Բ�����,���������λС��
import java.util.Scanner;
public class Yuan{
	public static void main(String[] args){
	System.out.print("������뾶��");
	final double  PI=3.1415926;
	Scanner input=new Scanner(System.in);
	int r=input.nextInt();//����Բ�İ뾶
	double s=((int)((PI*r*r+0.005)*100))/100.0;
	System.out.print("�뾶Ϊ"+r+"��Բ�����Ϊ"+s);
	}	
}
