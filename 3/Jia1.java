//随机产生两位数以内加减法
import java.util.Scanner;
public class Jia1{
	public static void main(String[] args){
	int s,i;
	int a=(int)(Math.random()*100);
	int b=(int)(Math.random()*100);
	int c=((int)(Math.random()*100))%2;
	switch(c){
	case 0: System.out.printf(a+"+"+b+"=");s=a+b;
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	if(x==s){
	break;}
	else{System.out.println("正确答案是："+s);}
	break;
	case 1:
	if(a>b){
	s=a-b;System.out.printf(a+"-"+b+"=");}
	else {s=b-a;System.out.printf(b+"-"+a+"=");}
	Scanner inpu=new Scanner(System.in);
	int y=inpu.nextInt();
	if(y==s){
	break;}
	else{System.out.println("正确答案是："+s);}
	}
	
		
        }
}