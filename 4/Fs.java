import java.util.Scanner;//��1/1+1/2....+1/n�ĺ�
	public class Fs{
	   public static void main(String[] args){
	System.out.print("��������С�����ķ�ĸ��");
	Scanner input=new Scanner(System.in);
	int i=input.nextInt();
	int j=1;
	double s=0;
	while(j<=i){
	s+=1.0/j;
	j++;
	}
	System.out.print("1/1+1/2....+1/n�ĺ�Ϊ"+s);
}
}