import java.util.Scanner;//���������ͺ����Ľ��
public class Bfh{
 public static void main(String[] args){
	Scanner o=new Scanner(System.in);
	int x=o.nextInt();
	System.out.println("�������"+x);
	int y=bfh(x);
	System.out.println("û�и�ֵ�Ľ��"+x);
	System.out.println("������"+y);
}

public static int bfh(int n){
	n++;
	System.out.println("�����е���"+n);
	return n;
}
}