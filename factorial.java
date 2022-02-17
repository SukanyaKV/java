package main;

import java.util.Scanner;

public class factorial {
	
	public static void main(String args[]){  
		  int i,fact=1;  
		  	Scanner sc = new Scanner(System.in);
			System.out.print("Enter the limit:");
			int n= sc.nextInt();
					
		  for(i=1;i<=n;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+n+" is: "+fact);  
		  
		  
		  Scanner sc1 = new Scanner(System.in);
		  System.out.print("Enter the limit:");
			int l= sc1.nextInt();
			 int facto =1; i=1;
			   
			while(i<=l) 
			{
				facto=facto*i;
				i++;
			}  
			System.out.println("Factorial of "+l+" is: "+facto);  
	}

}
