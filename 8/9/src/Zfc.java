import java.util.Scanner;
public class Zfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("请输入主串：");
		String s1=s.next();
		System.out.print("请输入子串：");
		String s2=s.next();
		int x=cs(s1,s2);
		System.out.print(s2+"在"+s1+"中出现"+x+"次");
	}
	public static int cs(String s1,String s2)
	{
		if(s1.contains(s2))
		{
			int z=0;
			int s=0;
			while(s>=0)
			{
				s=s1.indexOf(s2);z++;
				s1=s1.substring(s+1);
			};
			return z-1;
			
		}else
		return 0;

	}	

}
