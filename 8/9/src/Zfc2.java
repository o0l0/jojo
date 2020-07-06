import java.util.Scanner;
public class Zfc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("请输入字符串（不要输入空格）：");
		String s1=s.next();
		System.out.println();
		px(s1);
		
		
	}
	
      public static void px(String s1)
      {
    	  StringBuffer s2=new StringBuffer();
    	  char z=0;
    	  char[] x=s1.toCharArray();
    	  for(int i=0;i<x.length;i++)
    	  {
    		  for(int j=i+1;j<x.length;j++)
    		  {
    			  if(x[i]>x[j]) {
    				  z=x[i];
    				  x[i]=x[j];
    				  x[j]=z;
    				  
    			  }
    		  }
    		
    	  }
    	  for(int i=0;i<x.length;i++)
    	  {
    		  s2.append(x[i]);
    	  } 
    	  System.out.print(s2);
      }

}




















