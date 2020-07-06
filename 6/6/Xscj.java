import java.util.Scanner;
  public class Xscj{
	public static void main(String[] args){
	int x=1;
	System.out.print("输入学生个数：");
	Scanner input=new Scanner(System.in);
	int y=input.nextInt();
	System.out.println("输入学生成绩：");
	int[] n=new int[y];
	for(int i=0;i<y;i++){
	int q=i+1;
	System.out.print("第"+q+"个学生的成绩：");
	n[i]=input.nextInt();
	}
	double a=max(n);
	double b=min(n);
	double c=pjf(n);
	double d=jgl(n);
	System.out.println("最大值:"+a+"/最小值:"+b+"/平均值:"+c+"/及格率:"+d+"%");	

}
	public static double max(int[] c){
	int j,x=c.length;
 	int max=c[0];
	for(j=0;j<x;j++){	
	if(max<c[j]){max=c[j];
	}
	}return max;
}
	public static double min(int[] c){
	int j,x=c.length;
 	int min=c[0];
	for(j=0;j<x;j++){	
	if(min>c[j]){min=c[j];
	}
	}return min;
}
	public static double pjf(int[] c){
	int i,s=0,x=c.length;
	for(i=0;i<x;i++){
	s+=c[i];
	}return (s*1.0)/x;
}	
	public static double jgl(int[] c){
	int i,n=0,x=c.length;
	for(i=0;i<x;i++){
	if(c[i]>60)n++;
	}
	if(n==0) return 0;
	else return (n*1.0)/x*100;
}
}













