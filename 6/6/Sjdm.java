import java.util.Random;
import java.util.Scanner;
  public class Sjdm{
	public static void main(String[] args){
	System.out.print(" ����ѧ��������");
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	System.out.println(x);
	String[] s=new String[x];
	for(int i=0;i<x;i++){
	System.out.print("�����"+(i+1)+"�����֣�");
	s[i]=input.next();
}
	for(int j=0;j<x;j++){
	System.out.println(s[j]);
}
	sj(s);
}
	public static void sj(String[] q)
	{	
	int c=((int)(Math.random()*10))%q.length;
	System.out.print(" ��"+(c+1)+"��"+q[c]+"����");	
}

}