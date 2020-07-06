import java.util.Scanner;
  public class Jsmj{
	public static void main(String[] args){
	System.out.println("输入：1.三角形；输入：2.矩形；输入：3.圆形 输入：4.梯形");
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();double s;
	switch(x){
	case 1:
	System.out.print("输入三角形的底和高：");
	int a=input.nextInt();int b=input.nextInt();
	s=sjc(a,b);System.out.print("三角形的面积是："+s);
	break;
	case 2:
	System.out.print("输入矩形的长和宽：");
	int c=input.nextInt();int k=input.nextInt();
	s=jx(c,k);System.out.print("矩形的面积是："+s);
	break;
	case 3:
	System.out.print("输入圆的半径：");
	int r=input.nextInt();
	s=yuan(r);System.out.print("圆的面积是："+s);
	break;
	case 4:
	System.out.print("输入梯形的上底长和下底长和高：");
	int o=input.nextInt();int z=input.nextInt();int h=input.nextInt();
	s=tx(o,z,h);System.out.print("梯形的面积是："+s);
	break;
}

}
	public static double sjc(int a,int b){
	double s=a*b/2.0;return s;
}
	public static double jx(int c,int k){
	double s=c*k;return s;
}
	public static double yuan(int r){
	final double PI=3.1415926;
	double s=r*r*PI;s=((int)((s+0.05)*100))/100.0;
	return s;
}	
		public static double tx(int c,int k,int h ){
	double s=(c+k)/2.0*h;s=((int)((s+0.05)*100))/100.0;
	return s;
}
}












