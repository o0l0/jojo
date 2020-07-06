//随机产生10以内加减法
import java.util.Scanner;
public class Jia{
	public static void main(String[] args){
	int s,i;
for(int j=0;j<10;j++){
	int a=(int)(Math.random()*10);
	int b=(int)(Math.random()*10);
	int c=((int)(Math.random()*100))%2;
	switch(c){
	case 0: System.out.printf(a+"+"+b+"=");s=a+b;for(i=0;i<=1000;i++){
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	if(x==s){
	break;}
	else{System.out.println("再想一想");}
	}
	break;
	case 1:
	if(a>b){
	s=a-b;System.out.printf(a+"-"+b+"=");}
	else {s=b-a;System.out.printf(b+"-"+a+"=");}
	for(i=0;i<=1000;i++){
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	if(x==s){
	break;}
	else{System.out.println("再想一想");}
	}
	}
	}	
        }
}