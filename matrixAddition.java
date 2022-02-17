package main;


public class matrixAddition {
	
	public static void main(String args[])
	{
	
		int a[][] = { {3,4,5},{2,6,5},{3,2,1}};
		int b[][] = {{1,2,3},{2,1,3},{5,7,3}};
		
		int c[][] =new int[20][20];
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j]+b[i][j];
					System.out.print(c[i][j]+ "   ");
			}
					System.out.println();
						
			}
				
		}
		
	}
