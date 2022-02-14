package main;

public class sampleClass {
 
	public static void main(String[] args) {
		int penValue = 10;
		int pencilValue = 5;
		int bookValue =50 ;
		double total = (2*pencilValue) + (6*penValue) + (1*50);
		 System.out.println("Total amount =" + total );		
		calculateArea(5,7);
		
	
		
		 double discountPrice = total - (0.1* total);
		 
		 double amountPayable = discountPrice + (0.5*discountPrice);
		 
		 System.out.println("Total amount paid by John =" + amountPayable );	
	}

	private static int calculateArea(int i, int j) {
		// TODO Auto-generated method stub
		int area  = i*j;
		return area;
	}
}
