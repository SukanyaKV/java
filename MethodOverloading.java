package main;

public class MethodOverloading {
	{
	    void area(float x)
	    {
	        System.out.println("the area of the square is "+x*x+" sq units");
	    }
	    void area(float x, float y)
	    {
	        System.out.println("the area of the rectangle is "+x*y+" sq units");
	    }
	    void area(double x)
	    {
	        double z = 3.14 * x * x;
	        System.out.println("the area of the circle is "+z+" sq units");
	    }
	}
	class Overload 
	{
	     public static void main(String args[]) 
		{
		   MethodOverloading ob = new MethodOverloading();
		   ob.area(5);
		   ob.area(11,12);
		   ob.area(2.5);
	        }
	}