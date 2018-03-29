import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 
	       
	        for(int i=str.length()-1;i>=0;i--)
	            {
	                System.out.print(str.charAt(i));
	            }
	        
	        
	        /* 		!! OR !!
	         
	        for(int i=1; i<str.length()+1;i++)
            {
                System.out.print(str.charAt(str.length()-i));
            }
            
	         */
	}

}
