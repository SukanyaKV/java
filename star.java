package main;
import java.util.Scanner;
import java.io.*;

public class star {

			public static void main(String[] args) {
				int i,j;
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the limit:");
				int n= sc.nextInt();
				
				
				for(i=0; i<n; i++) {
					
			    for(j=0; j<=i; j++) {
						 	System.out.print("* ");
					 }
				System.out.println();
				}
			
			
		
		}	
			
	}
	

