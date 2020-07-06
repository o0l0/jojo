package yhxt;
import java.util.Scanner;
public class Zhs {
	public static void main(String[] args) {
		int i;
		/*Scanner x=new Scanner(System.in);
		 
		String x1=x.next();*/
		Bank.yhmc="旺财银行";
		Bank.hy();
		Scanner x=new Scanner(System.in);
		Scanner y=new Scanner(System.in);
/*		System.out.println("请输入开户人：");
		String x1=x.next();
		System.out.println("请输入开户密码：");
		String x2=x.next();
		System.out.println("请输入开户预存：");
		*/
		Bank bank=new Bank();
		bank.yh("老王",10086,10000000);
		for(int z=0;z<10000;z++) {	
		System.out.println("请选择：1.我是VIP 2.我要开户 ");
		int y1=y.nextInt();
		switch(y1)
		{
		case 1:		
		
			for(i=3;i>0;i--) 
		{
			System.out.println("请输入密码：");
			int x5=x.nextInt();
			if(x5==bank.zhmm(x5)){
			System.out.println("你还有"+(i-1)+"次机会");
		}else break;
		}
		if(i==0){bank.gun();return;}
		for(int j=0;j<1000000;j++) 
		{
		System.out.println("请选择：1.取款  2.存款  3.查询余额 4.修改密码 5.退出 ");
		int x3=x.nextInt();
		
		switch(x3)
		{
		case 1:
			System.out.println("请输入取款数：");
			double x6=x.nextInt();
			bank.qk(x6);break;
		case 2:
			System.out.println("请输入存款数：");
			double x4=x.nextInt();
			bank.ck(x4);break;
		case 3:
			bank.cx();break;
		case 4:
			for(int f=0;f<3;f++)
			{
			System.out.println("输入新密码：");
			int x5=x.nextInt();
			System.out.println("请确认密码：");
			int x7=y.nextInt();
			if(x5!=x7)
			{
				System.out.println("两次输入不一致！");
				if(f==3){break;}
				
			}else { bank.yh("老王",x5,1000000);System.out.println("修改成功！");break;}
			}
			
			break;
		case 5:
			bank.gun();
			return;
		}
		}//for
		break;
			
		case 2:
			System.out.println("请输入开户人：");
			String y2=y.next();
			for(int j = 0;j<3;j++)
			{
			System.out.println("请输入开户密码：");
			int y3=y.nextInt();
			System.out.println("请确认密码：");
			int y4=y.nextInt();
			if(y4!=y3)
			{
				System.out.println("两次输入不一致！");
				if(j==3){bank.gun();return;}
				else continue;
			}
			else 
				System.out.println("请输入开户预存：");
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