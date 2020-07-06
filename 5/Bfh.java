import java.util.Scanner;//不返回类型函数的结果
public class Bfh{
 public static void main(String[] args){
	Scanner o=new Scanner(System.in);
	int x=o.nextInt();
	System.out.println("输入的数"+x);
	int y=bfh(x);
	System.out.println("没有赋值的结果"+x);
	System.out.println("最后的数"+y);
}

public static int bfh(int n){
	n++;
	System.out.println("函数中的数"+n);
	return n;
}
}