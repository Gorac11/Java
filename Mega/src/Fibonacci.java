package fibonacciPackage;
import java.util.*;
//Enter a number and have the program generate the
//Fibonacci sequence to that number or to the Nth number.

public class Fibonacci {
	
	static void fibo(int nthNum) {		//Method	
			 if(nthNum <= 1){
				 System.out.println(0);
				 System.exit(0);
			 }
			 String sequence="0"+"\n1";		//First 2 numbers
			 long fibo = 1;
			 long fiboPrev = 1;
			 
			 for(int i = 2; i < nthNum; ++i){
				 sequence+="\n"+fibo;		// Adding to the string
				 long temp = fibo;
				 fibo += fiboPrev;
				 fiboPrev = temp;			  		  
			 }
			 System.out.println(sequence);		//Printing string
			 		 
	}	//Method End
	
	public static void main(String[] args) {
				
		System.out.println("input how many fibonacci numbers to generate: ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		fibo(number);
		
	}

}
