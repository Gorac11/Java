import java.util.Scanner;
public class IntegerToRoman {
	public static String ToRoman(int num){
		String roman="";
	        int matches;
	        int magnitude[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String symbol[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        
	        for(int x=0; num>0; x++){
	        	matches=num/magnitude[x];
			//Shows how it works:
	        	/*System.out.println(
	        		"Test: "+ num+
	        		" \t"+magnitude[x]+
	        		" \tmatches: "+matches+
	        		" \tfor: "+symbol[x]+
	        		"\tCycle: "+(x+1));
			*/
	        	for(int i=1; i<=matches; i++){
	        		roman=roman + symbol[x];
	                	//System.out.println(roman+"   left: "+(matches-i));	//Shows how the string forms after every match
	            	}	//inner for loop ends
	            num=num%magnitude[x];
		}	//outer for loop ends
	        return roman;
	}
	 
	public static void main(String args[]){
		int num;
	    	do{ 
	    		System.out.println("Insert positive integer upto 3999:");
	    		Scanner sc=new Scanner(System.in);
	    		num=sc.nextInt();
	    	
	    	}while(num>=4000||num<=0);
	    	System.out.println(num+": "+ToRoman(num));
	    	
	}
}
