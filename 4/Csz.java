import java.util.Scanner;//猜数字
     public class Csz{
	public static void main(String[] args){
	int x=(int)(Math.random()*100);
//System.out.print(x);
	System.out.print("请猜一个100以内的数字：");
	for(int j=0;j<100;j++){
	Scanner input=new Scanner(System.in);
	int y=input.nextInt();
	if(x==y){
	System.out.print("哦，你猜对了！");
	break;
	}if(y<x)
	System.out.print("小了，再猜一次");
	if(y>x)System.out.print("大了，再猜一次");
	}
}

}
