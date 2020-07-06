//随机产生10以内加减法
import java.util.Scanner;
public class Jiajian10{
	public static void main(String[] args){
	int s,i,p=0,k;
	System.out.printf("输入题目数量");
	Scanner in=new Scanner(System.in);
	int q=in.nextInt();
for(int j=0;j<q;j++){
	int a=(int)(Math.random()*10);
	int b=(int)(Math.random()*10);
	int c=((int)(Math.random()*100))%2;
	switch(c){
	case 0: System.out.printf(a+"+"+b+"=");s=a+b;
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	if(x==s){p++;
	}
	break;
	case 1:
	if(a>b){
	s=a-b;System.out.printf(a+"-"+b+"=");}
	else {s=b-a;System.out.printf(b+"-"+a+"=");}
	
	Scanner inpu=new Scanner(System.in);
	int m=inpu.nextInt();
	if(m==s){p++;}
	}
	}
	k=q-p;
	System.out.println(q+"道题对了"+p+"题，错了"+k+"题");	
        }
}