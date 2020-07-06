package bao;
    import java.util.Scanner;
    import java.util.*;
    public class Jsmj {
	private double width;
	private double height;
	private static String color;
	public Jsmj()
	{
		width=1;
		height=1;
		System.out.println("周长：4，面积:1");
	}
	public Jsmj(double width,double height,String color)
	{
		System.out.println("长:"+width+"  宽:"+height+"  颜色:"+color);
		double zc=(width+height)*2;
		double mj=width*height;
		System.out.println("周长"+zc+"面积"+mj);

	}
	public double getWidth() 
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getHeight() 
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public static String getColor() 
	{
		return color;
	}
	public static void setColor(String color)
	{
		color=color;
	}
	public double findArea()
	{
		return width*height;
	}
	public double findZc()
	{
		return (width+height)*2;
	}

	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.print("输入长，宽，颜色：");
		double x=t.nextDouble();
		double y=t.nextDouble();
		String s=t.nextLine();
		Jsmj s1=new Jsmj();
		Jsmj s2=new Jsmj(x,y,s);
		s1.setWidth(6);
		s1.setHeight(25);
		s1.setColor("黄色");
		s2.setWidth(4);
		s2.setHeight(40);
		s2.setColor("紫色");
		System.out.println("长:"+s1.getWidth()+"  宽:"+s1.getHeight()+"  颜色:"+s1.getColor());
		System.out.println("长:"+s2.getWidth()+"  宽:"+s2.getHeight()+"  颜色:"+s2.getColor());
		System.out.print("周长"+s1.findZc());
		System.out.println("面积"+s1.findArea());
	
	}

	
}
    