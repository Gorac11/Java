import java.util.Scanner;
public class CountVowel {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int vowelCount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==('a')||
			   str.charAt(i)==('e')||
			   str.charAt(i)==('o')||
			   str.charAt(i)==('u')||
			   str.charAt(i)==('i')) {
				vowelCount++;
			}
			
		}
		System.out.println(vowelCount);
		
	}
}
