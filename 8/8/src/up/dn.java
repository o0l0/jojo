package up;

public class dn {
	private USB[] u=new USB[3];
	public void oll(USB a)
	{
		for(int i=0;i<u.length;i++)
		{
			if(u[i]==null) {
			u[i]=a;	
			break;
			}
		}
	}
	public void dnk()
	{
		for(int i=0;i<u.length;i++)
		{
			if(u[i]!=null)
				u[i].on();
		}
		System.out.println("电脑已启动");
	}
	public void dng()
	{
		for(int i=0;i<u.length;i++)
		{
			if(u[i]!=null)
				u[i].off();
		}
		System.out.println("电脑已关闭");
	}
}
