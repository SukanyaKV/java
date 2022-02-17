package main;

import java.util.Scanner;

public class StringReverse {
	
		  public static void main(String[] args) {
		    
			  Scanner sc= new Scanner(System.in);  
				System.out.println("Enter a string: ");  
				String str1= sc.nextLine();  
		       String reverseString = "";
		    
		    for(int i = str1.length()-1; i>=0; i--){
		      reverseString = reverseString + str1.charAt(i);
		    }
		    
		    System.out.print("The reversed string of the '"+str1+"' is: " );
		    System.out.println(reverseString);
		  }
	}

