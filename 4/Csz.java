import java.util.Scanner;//������
     public class Csz{
	public static void main(String[] args){
	int x=(int)(Math.random()*100);
//System.out.print(x);
	System.out.print("���һ��100���ڵ����֣�");
	for(int j=0;j<100;j++){
	Scanner input=new Scanner(System.in);
	int y=input.nextInt();
	if(x==y){
	System.out.print("Ŷ����¶��ˣ�");
	break;
	}if(y<x)
	System.out.print("С�ˣ��ٲ�һ��");
	if(y>x)System.out.print("���ˣ��ٲ�һ��");
	}
}

}
