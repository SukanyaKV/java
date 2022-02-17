package main;
import java.util.Scanner;  


public class test {
	
	public static void main(String args[]) {
		 Scanner input= new Scanner(System.in); 
		 System.out.print("Input first floating­point number: "); 
		 float n1 = input.nextFloat(); 
		 System.out.print("Input second floating­point number: "); 
		 float n2 = input.nextFloat(); 
		 
		 if(Math.ceil(Math.abs(n1-n2)) < 0.01) {
			 System.out.print("The numbers are same "); 
		 }
			 
			 else {
				 System.out.print("The numbers are different "); 
			 }
		}

	private static double abs(float f) {
		// TODO Auto-generated method stub
		return 0;
	}

}
