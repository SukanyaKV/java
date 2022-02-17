package main;

import java.util.Scanner;

public class primeNumbers {

	 public static void main(String[] args)
	    {
		int i;
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the lower limit: ");
	        int a = sc.nextInt(); 
	 
	        
	        System.out.println("Enter the upper limit: ");
	        int b = sc.nextInt();
	        
	       System.out.printf("Prime numbers between %d and %d  are: ", +a, +b);
	       int flag = 1;
	       for ( i = a; i <= b; i++) 
	       {
	    	   if (i == 1 || i == 0)
	                continue;
	    	   for ( int j = 2; j <= i / 2; ++j)
	    	   {
	    		   if (i % j == 0) 
	    		   {
	    			   flag = 0;
	    			   break;
	    		   } 	
	    		   else 
	    			   flag=1;
	    	   }
	    	   if (flag == 1)
               System.out.println(i);
	    	 
           }
	    }
}

