//����Բ�����,���������λС��
import java.util.Scanner;
public class JiaJian{
	public static void main(String[] args){
	int s,i,j;

	int a=(int)(Math.random()*10);
	int b=(int)(Math.random()*10);
	int c=((int)(Math.random()*100))%2;
	switch(c){
	case 0: System.out.printf(a+"+"+b+"=");s=a+b;for(i=0;i<=1000;i++){
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	if(x==s){
	break;}
	else{System.out.printf("����һ��");}
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
	else{System.out.printf("����һ��");}
	}
	}
		
        }
}