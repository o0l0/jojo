//����Բ�����,�ж�����뾶�Ƿ�Ϸ������������λС��
import java.util.Scanner;
public class Yuan1{
	public static void main(String[] args){
	System.out.print("������뾶��");
	final double  PI=3.1415926;
	Scanner input=new Scanner(System.in);
	int r=input.nextInt();//����Բ�İ뾶
	if(r>=0){
	double s=((int)(PI*r*r*100))/100.0;
	System.out.print("�뾶Ϊ"+r+"��Բ�����Ϊ"+s);
	}
	else{System.out.print("�˰뾶���Ϸ�");
	}	
}
}