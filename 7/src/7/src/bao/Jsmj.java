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
		System.out.println("�ܳ���4�����:1");
	}
	public Jsmj(double width,double height,String color)
	{
		System.out.println("��:"+width+"  ��:"+height+"  ��ɫ:"+color);
		double zc=(width+height)*2;
		double mj=width*height;
		System.out.println("�ܳ�"+zc+"���"+mj);

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
		System.out.print("���볤������ɫ��");
		double x=t.nextDouble();
		double y=t.nextDouble();
		String s=t.nextLine();
		Jsmj s1=new Jsmj();
		Jsmj s2=new Jsmj(x,y,s);
		s1.setWidth(6);
		s1.setHeight(25);
		s1.setColor("��ɫ");
		s2.setWidth(4);
		s2.setHeight(40);
		s2.setColor("��ɫ");
		System.out.println("��:"+s1.getWidth()+"  ��:"+s1.getHeight()+"  ��ɫ:"+s1.getColor());
		System.out.println("��:"+s2.getWidth()+"  ��:"+s2.getHeight()+"  ��ɫ:"+s2.getColor());
		System.out.print("�ܳ�"+s1.findZc());
		System.out.println("���"+s1.findArea());
	
	}

	
}
    