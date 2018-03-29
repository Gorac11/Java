import java.util.Scanner;
public class IntegerToRoman {
	    public static String ToRoman(int n){
	        String roman="";
	        int repeat;
	        int magnitude[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String symbol[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        
	        repeat=n/1;
	        for(int x=0; n>0; x++){
	            repeat=n/magnitude[x];
	            //System.out.println("Test: "+ n/1+" "+magnitude[x]+" "+n/magnitude[x]);	//Shows how it works
	            for(int i=1; i<=repeat; i++){
	                roman=roman + symbol[x];
	                //System.out.println(roman);		//Shows how the string forms after every cycle
	            }
	            n=n%magnitude[x];
	        }
	        return roman;
	    }
	 
	    public static void main(String args[]){
	    	Scanner sc=new Scanner(System.in);
	    	int num=sc.nextInt();
	        System.out.println(num+": "+ToRoman(num));
	       
	    }
	}

