import java.util.Scanner; 
public class PigLatin {

	public static void main(String[] args) {
		
		String answer="";
		
		System.out.println("Want to find a word in Pig Latin? \"Yes\" or \"yes\" to confirm:");
		Scanner ask=new Scanner(System.in);
		answer=ask.nextLine();
		
		while(answer.equals("Yes")==true||answer.equals("yes")==true) {
		
		String engWord="";
		boolean TestFlag=false;
		int letterTicker=0;
		//In case a number is put as a letter
		do {		
			System.out.println("please enter a word: ");
			Scanner in = new Scanner(System.in);
			engWord = in.nextLine();
		
			char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
					'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			for(int i=0;i<engWord.length();i++){
			
				for(int j=0;j<arr.length;j++) {
					if(engWord.charAt(i)==arr[j]) {
						++letterTicker;
					}	
				}	//inner for loop ends
			}	//outer for loop ends
			//System.out.println(letterTicker);		//Prints the ticker
			//.out.println("necessary: "+engWord.length());	//Shows needed number of ticks
			if(letterTicker<engWord.length()) {
				TestFlag=true;
			}
		}while(TestFlag==true);		//end of loop
		
	    boolean CheckLetterVowel=false;
	        
	    String word=engWord;

	    char startLetter = word.charAt(0);
		
	        
	    if (
	    	startLetter == 'a' ||	startLetter == 'A' ||
	    	startLetter == 'e' ||	startLetter == 'E' ||
	    	startLetter == 'i' ||	startLetter == 'I' ||
	    	startLetter == 'o' ||	startLetter == 'O' ||
	    	startLetter == 'u' ||	startLetter == 'U' ) {
	        	
	    		word = word.concat("way");

	    } 
	    else {
	        String startconso = "";
	        	if(		word.charAt(1) != 'a' &&	word.charAt(1) != 'A' &&
	        			word.charAt(1) != 'e' &&	word.charAt(1) != 'E' &&
	        			word.charAt(1) != 'i' &&	word.charAt(1) != 'I' &&
	        			word.charAt(1) != 'o' &&	word.charAt(1) != 'O' &&
	        			word.charAt(1) != 'u' &&	word.charAt(1) != 'U' &&
	        			word.charAt(2) != 'a' &&	word.charAt(2) != 'A' &&
	        			word.charAt(2) != 'e' &&	word.charAt(2) != 'E' &&
	        			word.charAt(2) != 'i' &&	word.charAt(2) != 'I' &&
	        			word.charAt(2) != 'o' &&	word.charAt(2) != 'O' &&
	        			word.charAt(2) != 'u' &&	word.charAt(2) != 'U') {
	        			CheckLetterVowel=true;
	        	}
	        	if( CheckLetterVowel==true) {
	        			if(
	        				word.charAt(2)=='r'||	word.charAt(2)=='R'	||
	        		    	word.charAt(2)=='h'||	word.charAt(2)=='H'	||
	        	        	word.charAt(2)=='l'||	word.charAt(2)=='L' ) {
	        	        			startconso=word.substring(0,3);
	        	        			word=word.concat(startconso).concat("ay");
	        	        			word=word.substring(3);
	        		
	        			}
	        	}
	        	else if(
	        			word.charAt(1) == 'p' ||	word.charAt(1) == 'P' ||
	        			word.charAt(1) == 'l' ||	word.charAt(1) == 'L' ||
	        			word.charAt(1) == 'h' ||	word.charAt(1) == 'H' ||
	        			word.charAt(1) == 'm' ||	word.charAt(1) == 'M' ||
	        			word.charAt(1) == 't' ||	word.charAt(1) == 'T' ||
	        			word.charAt(1) == 'g' ||	word.charAt(1) == 'G' ||
	        			word.charAt(1) == 'r' ||	word.charAt(1) == 'R' ) {
	        	
	        				startconso = word.substring(0, 2);
	        		
	        				word = word.concat(startconso).concat("ay");
	        				word = word.substring(2);
	        	
	        	}
	        
	        	else {
	        		startconso = String.valueOf(startLetter);
	        		word = word.concat(startconso).concat("ay");
	        		word = word.substring(1);
	        	}
	            
	           
	    }	//ends all ifs
	        System.out.println("The word you passed is : \"" + word + "\" in Pig Latin!");
	        System.out.println("Shall we continue? ");
	        Scanner repeat=new Scanner(System.in);
			answer = repeat.nextLine();	
			
			}//end of while loop
		System.out.println("Goodbye then.");		
	}
}
