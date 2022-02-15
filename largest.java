package main;
import java.util.Scanner;  

public class largest {
	
	public static void main(String args[])
	
	{
		int n;
		System.out.println("Enter the limit");
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		
		int a[] = new int[20];
		System.out.println("Enter the array elements :");
		
		for(int i=0; i<n; i++) 
		{
			a[i] = sc.nextInt();
		}
			
		int smallest = a[0];
		int largest = a[0];
		
		 for(int i=1; i< n; i++)
		 {
			 if(a[i] > largest)
				 largest = a[i];
			 else if (a[i] < smallest)
				 smallest = a[i];
		 
		 }
		 System.out.println("Smallest Number is : " + smallest);
		 System.out.println("Largest Number is : " + largest); 
		 }
		
		
	}

