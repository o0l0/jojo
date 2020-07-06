import java.util.Scanner;//菱形
     public class Lx{
	public static void main(String[] args){
	System.out.print("请输入菱形的层数");
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	
	for(int i=1;i<=(x+1)/2;i++){
	int s=(x+1)/2-i;int n=0;
	for(int j=1;j<=i ;j++){
	if(n==0){
	     for(int l=s;l>=0;l--){System.out.print(" ");n++;}}
		System.out.print("* ");
	}	System.out.print("\n");
	}


		for(int i=x/2-1;i>=0;i--){
		int s=x/2-i;int n=0;
		for(int j=i;j>=0 ;j--){
		if(n==0){
	     for(int l=s;l>=0;l--){System.out.print(" ");n++;}}
		System.out.print("* ");
	}	System.out.print("\n");
	}
	
}

}
