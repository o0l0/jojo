import java.util.Scanner;
  public class Jsmj{
	public static void main(String[] args){
	System.out.println("���룺1.�����Σ����룺2.���Σ����룺3.Բ�� ���룺4.����");
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();double s;
	switch(x){
	case 1:
	System.out.print("���������εĵ׺͸ߣ�");
	int a=input.nextInt();int b=input.nextInt();
	s=sjc(a,b);System.out.print("�����ε�����ǣ�"+s);
	break;
	case 2:
	System.out.print("������εĳ��Ϳ�");
	int c=input.nextInt();int k=input.nextInt();
	s=jx(c,k);System.out.print("���ε�����ǣ�"+s);
	break;
	case 3:
	System.out.print("����Բ�İ뾶��");
	int r=input.nextInt();
	s=yuan(r);System.out.print("Բ������ǣ�"+s);
	break;
	case 4:
	System.out.print("�������ε��ϵ׳����µ׳��͸ߣ�");
	int o=input.nextInt();int z=input.nextInt();int h=input.nextInt();
	s=tx(o,z,h);System.out.print("���ε�����ǣ�"+s);
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












