import java.util.Random;
import java.util.Scanner;
  public class Sjdm{
	public static void main(String[] args){
	System.out.print(" 输入学生个数：");
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	System.out.println(x);
	String[] s=new String[x];
	for(int i=0;i<x;i++){
	System.out.print("输入第"+(i+1)+"个名字：");
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
	System.out.print(" 第"+(c+1)+"个"+q[c]+"出列");	
}

}