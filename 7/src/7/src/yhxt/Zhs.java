package yhxt;
import java.util.Scanner;
public class Zhs {
	public static void main(String[] args) {
		int i;
		/*Scanner x=new Scanner(System.in);
		 
		String x1=x.next();*/
		Bank.yhmc="��������";
		Bank.hy();
		Scanner x=new Scanner(System.in);
		Scanner y=new Scanner(System.in);
/*		System.out.println("�����뿪���ˣ�");
		String x1=x.next();
		System.out.println("�����뿪�����룺");
		String x2=x.next();
		System.out.println("�����뿪��Ԥ�棺");
		*/
		Bank bank=new Bank();
		bank.yh("����",10086,10000000);
		for(int z=0;z<10000;z++) {	
		System.out.println("��ѡ��1.����VIP 2.��Ҫ���� ");
		int y1=y.nextInt();
		switch(y1)
		{
		case 1:		
		
			for(i=3;i>0;i--) 
		{
			System.out.println("���������룺");
			int x5=x.nextInt();
			if(x5==bank.zhmm(x5)){
			System.out.println("�㻹��"+(i-1)+"�λ���");
		}else break;
		}
		if(i==0){bank.gun();return;}
		for(int j=0;j<1000000;j++) 
		{
		System.out.println("��ѡ��1.ȡ��  2.���  3.��ѯ��� 4.�޸����� 5.�˳� ");
		int x3=x.nextInt();
		
		switch(x3)
		{
		case 1:
			System.out.println("������ȡ������");
			double x6=x.nextInt();
			bank.qk(x6);break;
		case 2:
			System.out.println("������������");
			double x4=x.nextInt();
			bank.ck(x4);break;
		case 3:
			bank.cx();break;
		case 4:
			for(int f=0;f<3;f++)
			{
			System.out.println("���������룺");
			int x5=x.nextInt();
			System.out.println("��ȷ�����룺");
			int x7=y.nextInt();
			if(x5!=x7)
			{
				System.out.println("�������벻һ�£�");
				if(f==3){break;}
				
			}else { bank.yh("����",x5,1000000);System.out.println("�޸ĳɹ���");break;}
			}
			
			break;
		case 5:
			bank.gun();
			return;
		}
		}//for
		break;
			
		case 2:
			System.out.println("�����뿪���ˣ�");
			String y2=y.next();
			for(int j = 0;j<3;j++)
			{
			System.out.println("�����뿪�����룺");
			int y3=y.nextInt();
			System.out.println("��ȷ�����룺");
			int y4=y.nextInt();
			if(y4!=y3)
			{
				System.out.println("�������벻һ�£�");
				if(j==3){bank.gun();return;}
				else continue;
			}
			else 
				System.out.println("�����뿪��Ԥ�棺");
			int y5=y.nextInt();
			bank.yh("y2",y3,y5);break;
			}
		break;
		}
		continue;
		}
		bank.gun();
       x.close();
       y.close();

}

	
}