package sjx;

public class Sjx extends Nbb {
	double sjx1=1.0;
	double sjx2=1.0;
	double sjx3=1.0;
	public Sjx() 
	{	
	}
	public Sjx(double sjx1,double sjx2,double sjx3)
	{
	}
	public double getSjx1()
	{
		return sjx1;
	}
	public void setSjx1(double sjx1)
	{
		this.sjx1=sjx1;
	}
	public double getSjx2()
	{
		return sjx2;
	}
	public void setSjx2(double sjx2)
	{
		this.sjx2=sjx2;
	}
	public double getSjx3()
	{
		return sjx3;
	}
	public void setSjx3(double sjx3)
	{
		this.sjx3=sjx3;
	}
	public double getmj()
	{
		double s=(sjx1+sjx2+sjx3)/2;
		double x=Math.sqrt(s*(s-sjx1)*(s-sjx2)*(s-sjx3));
		return x;
		
	}
	public double getzc()
	{
		double s=sjx1+sjx2+sjx3;
		return s;
	}
	public String sx()
	{
	return "此三角形的的三条边分别是"+sjx1+sjx2+sjx3; 
	}

	
}
















