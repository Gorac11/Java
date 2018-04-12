import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.util.Scanner;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Control;

public class PigLatin {

	protected Shell shell;
	private Text scanner;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PigLatin window = new PigLatin();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(552, 404);
		shell.setText("Pig Latin Translator");
		
		scanner = new Text(shell, SWT.BORDER);
		scanner.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		scanner.setBounds(84, 83, 339, 53);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblNewLabel.setBounds(179, 10, 191, 71);
		lblNewLabel.setText("Enter word:");
		
		Label answerLabel = new Label(shell, SWT.NONE);
		answerLabel.setTextDirection(3354432);
		answerLabel.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
		answerLabel.setBounds(71, 225, 432, 59);
		answerLabel.setText("Answer Field");
		
		Button convertButton = new Button(shell, SWT.NONE);
		convertButton.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		convertButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String engWord="";
				boolean TestFlag=false;
				int letterTicker=0;
				//In case a number is put as a letter
						
					
					engWord = scanner.getText();
				
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
					//System.out.println("necessary: "+engWord.length());	//Shows needed number of ticks
					if(letterTicker<engWord.length()) {
						TestFlag=true;
					}
					if (TestFlag==true) {
						MessageDialog.openError(shell,"Error", "That is not a valid word!");
					}
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
					answerLabel.setText("In Pig Latin: "+word);
			}
		});
		convertButton.setBounds(179, 162, 122, 42);
		convertButton.setText("Convert");
		shell.setTabList(new Control[]{scanner, convertButton});

	}
}
