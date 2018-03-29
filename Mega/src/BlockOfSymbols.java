import java.util.Scanner;
public class BlockOfSymbols {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Insert symbol: ");
		String symbol=sc.nextLine();
		
		//**
		while(symbol.length()>1) {				 //If symbol has to be one character
			System.out.print("Insert symbol: ");
			symbol=sc.nextLine();
		}
		//**//
		
		System.out.print("Inser Columns: ");
		int col=sc.nextInt();
		
		System.out.print("Insert Rows: ");
		int row=sc.nextInt();
		
		for(int j=0;j<row;j++) {				 //Where the magic Happens
			for(int i=0;i<col;i++) {
				System.out.print(symbol);
			}
			System.out.print('\n');
		}
		
	}

}
