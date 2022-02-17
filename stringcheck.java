package main;
import java.util.Scanner;

public class stringcheck {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);  
		System.out.println("Enter a string: ");  
		String str1= sc.nextLine();              
		String strArr[]= str1.split(" ");
		
		Scanner sc1= new Scanner(System.in);  
		System.out.println("Enter a string: ");  
		String str2= sc1.nextLine();                 
		String strArr1[]= str2.split(" ");
		
		
		if(strArr[strArr.length - 1].equals(strArr1[strArr.length - 1])){
			
			System.out.println("True ");  
			
		}
		else
		{
			System.out.println("false ");  
		}  
		
	}
}

