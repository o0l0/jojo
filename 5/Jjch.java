import java.util.Scanner;
  public class Jjch{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("������Ҫ��������");
	int m=input.nextInt();
	for(int g=1;g<=m;g++){
	System.out.println("���룺1.�ӷ������룺2.���������룺3.�˷��� ���룺4.����");
	int x=input.nextInt();double s;
	switch(x){
	case 1:

	int a=(int)(Math.random()*10);int b=(int)(Math.random()*10);
	s=j(a,b);int y=input.nextInt();if(s==y)System.out.println("������");else  System.out.println("������");
	break;
	case 2:

	int c=(int)(Math.random()*10);;int k=(int)(Math.random()*10);
	s=jian(c,k);int j=input.nextInt();if(s==j)System.out.println("������");else  System.out.println("������");
	break;
	case 3:
	int r=(int)(Math.random()*10);int u=(int)(Math.random()*10);
	s=jj(r,u);int t=input.nextInt();if(s==t)System.out.println("������");else  System.out.println("������");
	break;
	case 4:
	int o=(int)(Math.random()*100+1);int z=(int)(Math.random()*100+1);
	s=tx(o,z);int l=input.nextInt();if(s==l)System.out.println("������");else  System.out.println("������");
	break;
}
}
}
	public static double j(int a,int b){
	double s=a+b;
                 System.out.printf(a+"+"+b+"=");
	return s;
}
	public static double jian(int c,int k){
	int y;
	if(k>c){y=c;c=k;k=c;}
	double s=c-k;System.out.printf(c+"-"+k+"=");return s;
}
	public static double jj(int r,int x){
	double s=r*x;System.out.printf(r+"*"+x+"=");
	return s;
}	
	public static double tx(int c,int k){
	int y;
	if(k>c){y=c;c=k;k=c;}
	double s=(c*1.0)/k;System.out.printf(c+"/"+k+"=");
	return s;
}
}













