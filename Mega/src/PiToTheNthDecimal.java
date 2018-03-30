import java.math.*;
public class PiToTheNthDecimal {
	public static void convert(int integer) {
		//100 digits
		final String pi="1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
		//System.out.println("3."+pi);		//To show the string pi
		
		int[] arr = new int[pi.length()];	//Making the string into array to store all digits
		
		for (int i = 0; i < pi.length(); i++)
		{
		    arr[i] = pi.charAt(i) - '0';	//Where we get the integer from ACII
		     
		    //arr[i] =Character.getNumericValue(pi.charAt(i));		//OR THIS WAY

		    
		}	//For loop ends
		System.out.print("3.");	
		for(int i=0;i<integer;i++) {
            System.out.print(arr[i]);
		}	//For loop ends
	
	}		//Method end
	
	public static void main(String[] args) {
		double randDouble=Math.random()*100;
		int randInt=(int) randDouble;
		System.out.println(randInt);		//To show the random number
		
		convert(randInt);	
	}

}
