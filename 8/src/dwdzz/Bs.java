package dwdzz;
import java.util.Random;
public class Bs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			Random x=new Random();
			int x1=x.nextInt(4);
			int x2=x.nextInt(5);
			switch(x1)
			{
			case 0:
				Nl s1=new Nl();s1.bh(i+1);s1.zl();
				System.out.print("我的名字叫"+s1.name(x2)+"--");
				s1.xw();s1.tx();
				break;
			case 1:
				Yl s2=new Yl();s2.bh(i+1);s2.zl();
				System.out.print("我的名字叫"+s2.name(x2)+"--");
				s2.xw();s2.tx();
				break;
			case 2:
				Kc s3=new Kc();s3.bh(i+1);s3.zl();
				System.out.print("我的名字叫"+s3.name(x2)+"--");
				s3.xw();s3.tx();
				break;
			case 3:
				Px s4=new Px();s4.bh(i+1);s4.zl();
				System.out.print("我的名字叫"+s4.name(x2)+"--");
				s4.xw();s4.tx();
				break;
			}
			
			
			
		}//for
	}

}
