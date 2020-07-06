package yhxt;

public class Bank {
	static String yhmc;//银行名称
	private String name;//用户名称
	private int mm;//密码
	private double zhye;//账户余额
	private double jye;//交易额
	static void hy() {
		System.out.println("--------------------"+"欢迎来到"+yhmc+"--------------------");
	}

		public void yh(String name,int mm,double jye) {
		this.name=name;
		this.mm=mm;
		this.jye=jye;
		this.zhye=jye-10;
		//System.out.println(mm);
		//System.out.println(name+"开户成功，账户余额"+zhye);
	}
	public int zhmm(int mm)
	{
		if(mm!=this.mm){System.out.print("密码错误，重新输入");
			return mm;}
		else return 0;
	}
	
	public void ck(double jye) {
		zhye=zhye+jye;
		System.out.println(name+"您好，您已存入"+jye+"元，账户余额"+zhye+"元");
	}
	
	public void qk(double jye) {
		if(zhye-jye>=0) {
			zhye=zhye-jye;
			System.out.println(name+"您好，您已取出"+jye+"元，账户余额"+zhye+"元");
		}else System.out.println("对不起，余额不足");
		
	}
	public void cx()
	{
		System.out.println(name+"您好，您账户余额"+zhye+"元");
	}
	void gun()
	{
		System.out.println("---------"+"欢迎下次再来"+yhmc+"---------");
	}

}
