package wl;

public class Kdrw {
	private String kddh;//快递单号
	private double hwzl;//货物重量
	public Kdrw(String kddh,double hwzl)
	{
		this.kddh=kddh;
		this.hwzl=hwzl;
	}
	public String getKddh()
	{
		return kddh;
	}
	public void setKddh(String kddh)
	{
		this.kddh=kddh;
	}
	public double getHwzl()
	{
		return hwzl;
	}
	public void setHwzl(double hwzl)
	{
		this.hwzl=hwzl;
	}
	public void hwysq()
	{
		System.out.println("订单处理，仓库验货中..");
		System.out.println("货物重量："+this.getHwzl()+"kg");
		System.out.println("货物检验完毕");
		System.out.println("货物填装完毕");
		System.out.println("运货人已通知");
		System.out.println("快递单号为："+this.getKddh());
	}
	public void hwysz(ysff x,GPS y)
	{
		System.out.println("运货人"+x.getFzr()+"驾驶编号为"+x.getBh()+"的"+x.getXh()+"发送货物");
		x.ys();
		String z=y.zb();
		System.out.println("货物当前坐标为:"+z);
	}
	public void hwysh(ysff x)
	{
		System.out.println("货物运送完成.");
		System.out.println("运货人"+x.getFzr()+"驾驶编号为"+x.getBh()+"的"+x.getXh()+"已归还");	
		x.bycf();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
