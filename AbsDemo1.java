import java.io.*;
interface shape
{
	public double area();
	public void display();
}
class Rectangle implements shape{
	double l,b;
	Rectangle (double x,double y)
	{
		l=x;
		b=y;
	}
	public double area()
	{
		return(l*b);
	}
	public void display()
	{
		System.out.println("Rectangle display");
	}
}
class Rectangle implements shape{
	double l,b;
	Rectangle(double x,double y)
	{
		l=x;
		b=y;
	}
}
public double area()
{
	return(0.5*l*b);
}
public void display()
{
	System.out.println()
	{
		System.out.println("Triangle display");
		{
			class AbsDemo1{
				public static void main(String args[])
				{
			    Rectangle R=new Rectangle(10,20);
		          R.display();
		          Triangle T=new Triangle(10,20);
		           T.display();
		            double ra=R.area();
		         double ta=T.area();
		          System.out.println("Rectangle area"+ra);
		         System.out.println("Triangle area"+ta);
				}
			}
		}
	}
}