import java.util.Scanner;
  public class Jsmj2{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	//int c=input.nextInt();int k=input.nextInt();int h=input.nextInt();
	//double c=input.nextDouble();double k=input.nextDouble();double h=input.nextDouble();
	double s1=mj(5);
              System.out.print("  圆的面积是："+s1);	
	double s2=mj(5.0,5.0);
	System.out.print("  三角形的面积是："+s2);
	int s3=mj(5,5);
	System.out.print("  矩形的面积是："+s3);
	double s4=mj(5,5,5);
	System.out.print("  梯形的面积是："+s4);



}
	public static double mj(double a,double b){
	double s=a*b/2.0;return s;
}
	public static int mj(int c,int k){
	int s=c*k;return s;
}
	public static double mj(int r){
	final double PI=3.1415926;
	double s=r*r*PI;s=((int)((s+0.05)*100))/100.0;
	return s;
}	
	public static double mj(int c,int k,int h ){
	double s=(c+k)/2.0*h;
	return s;
}
}












