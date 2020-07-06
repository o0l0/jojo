import java.util.Scanner;
  public class Xscj3{
	public static void main(String[] args){
	System.out.print("输入学生个数：");
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	int[] a=new int[x];
                  int[] b=new int[4];
	srcj(a);
	yyhs(a,b);
	scjg(b);

}
	public static void srcj(int[] a)
	{

	System.out.println("输入学生成绩：");
	for(int i=0;i<a.length;i++)
	{
	int q=i+1;
	Scanner input=new Scanner(System.in);
	System.out.print("第"+q+"个学生的成绩：");
	a[i]=input.nextInt();
	}
	}
	public static void yyhs(int[] a,int[] b)
	{
	maxmin(a,b);
	pjf(a,b);
	jgl(a,b);
	}
	public static void maxmin(int[] c,int[] b)
	{
	int i, j,s=0,x=c.length;
 	for(i=0;i<x;i++)
	{
	for(j=0;j<x;j++)
	{	
	if(c[i]>c[j]){
	s=c[i];
                c[i]=c[j];
	c[j]=s;}
	}
	}
	b[0]=c[0];b[1]=c[c.length-1];
	}

	public static void pjf(int[] c,int[] b)
	{
	int i,s=0,x=c.length;
	for(i=0;i<x;i++){
	s+=c[i];
	}
                 b[2]=s/x;	
	}
	
	public static int jgl(int[] c,int[] b)
	{
	int i,n=0,x=c.length;
	for(i=0;i<x;i++){
	if(c[i]>60)n++;
	}
	if(n==0) return 0;
	else return b[3]=(int)((n*1.0)/x*100);
	}

	public static void scjg(int[] b)
	{
	System.out.println("最大值:"+b[0]+"/最小值:"+b[1]+"/平均值:"+b[2]+"/及格率:"+b[3]+"%");	
	}
}













