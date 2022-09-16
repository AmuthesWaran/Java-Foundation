package oops.polymorphis.static_pm;

public class Shape {
	
	// area of a circle
	public void area(float r) 
			{
				float pi = 3.14f;
				float area = pi * r * r;
				System.out.println("area of a circle\t: "+area);
			}
	
	//area of a rectangle
	public void area(float l, float b)
			{
				float area = l * b;
				System.out.println("area of a rectangle\t: "+area);
			}
	
	//area of a square
	public void area(double s)
			{
			
				double area = s*s;
				System.out.println("area of a square\t: "+area);
			}
	//area of triangle
	public void area(double b, double h)
	{
				double area = 0.5 * b * h;
				System.out.println("area of triangle\t: "+area);
	}	
}
