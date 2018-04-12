import java.util.Enumeration;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		Boolean flag=false;
		String rev=new String();		//Important for reversing if needed
		
		for(int j=0;j<=n-1;j++)			//Prints the reverse of str
			rev+=str.charAt(n-j-1);
		
		for (int i=0;i<(n/2);i++) {
			if(str.charAt(i)!=str.charAt(n-i-1)) {
				/*  System.out.println(str.charAt(i)+" "+str.charAt(n-i-1)); //To print out the letter comparing */
				flag=false;}
				else {flag=true;
				
				/* System.out.println(str.charAt(i)+" "+str.charAt(n-i-1)); */
			}
			
		}
		System.out.println(flag+" "+rev);
	}

}
