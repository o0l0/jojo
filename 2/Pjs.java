//����������ƽ��ֵ,���������λС��
import java.util.Scanner;
public class Pjs{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("��һ����");
	double x=input.nextDouble();
	System.out.print("�ڶ�����");
	double y=input.nextDouble();
	double s=(int)(((x+y)/2.0+0.005)*100)/100.0;
	System.out.print("����������ƽ������"+s);

		
        }
}