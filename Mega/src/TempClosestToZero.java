	import java.util.*;
	import java.io.*;
	import java.math.*;

public class TempClosestToZero {

	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Insert number of temperatures: ");
	        int n=0;
	        boolean testN=false;
	       while(testN==false)
	       {
	    	   try { n = in.nextInt(); 			//The number of temperatures to analyze.
	    	   		testN=true;
	           }
	            catch (InputMismatchException a) {
	            
	            in.nextLine();			//Really valuable!!!
	            System.out.print("Insert an integer: ");	                       		            
	            }
	       }	
	       //while loop ends
	       
	        double min=5526;
	        double max=-273;
	        boolean testFlag=false;
	        for (int i = 0; i < n; i++) {
	        	double t=0;
	        	do {			
				//start of loop	        		
	            if (t<-273||t>5526) {
	            	 System.out.println("Insert a VALID number: ");
	            }
	            else if(testFlag==false) {
	            	System.out.println("Insert temperature between -273 and 5526 degrees to compare: ");
	            }
	           try { t = in.nextDouble(); 			// a temperature expressed as a double ranging from -273 to 5526
	           		testFlag=false;
	           }
	            	catch (InputMismatchException a) { 
	            		in.nextLine();			//Valuable!!!
	            		testFlag=true;
	            	    System.out.print("Insert a valid NUMBER: ");
	            	}	           	        	   	           	           
	        	}
	        	while(t<-273||t>5526||testFlag==true); 		
	        	//while loop ends
	        	
	            if(n==1){
	                System.out.println("The closest temperature to zero is: "+t);
	                System.exit(0);
	            }
	            if(t>0||t==0){
	                if(min==5526){
	                min=t;
	                }
	                if(min>t){
	                    min=t;
	                }	                
	            }
	            if(t<0){
	                if(max==-273){
	                    max=t;
	                }
	                if(max<t){
	                max=t;
	                }
	            }
	        } 				//For loop end
	      
	        System.out.println("The closest temperature to zero is: ");
	        
	        if(n==0){
	            System.out.println("0");
	        }
	        	else if(min==Math.abs(max)){
	        		System.out.println(min);
	        	}
	        		else if(min<Math.abs(max)){
	        			System.out.println(min);
	        		}
	            		else{System.out.println(max);	                    
	            		}
	    }
	}
