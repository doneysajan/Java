import java.io.*;
abstract class shape
{
	int l,b;
	shape(int x,int y)
	{
		l=x;
		b=y;
	}
	abstract double area();
	void display()
	{
		System.out.println("parent display");
	}
}
class Rectangle extends shape
{
	Rectangle(int x,int y)
	{
		super(x,y);
	}
	double area()
	{
		return(l*b);
	}
	void display()
	{
		System.out.println("Rectangle display");
	}
}
class Triangle extends shape
{
	Triangle(int x,int y)
	{
		super(x,y);
	}
	double area()
	{
		return(0.5*l*b);
	}


	void display()
	{
		System.out.println("Triangle display");
	}
}
	

class AbsDemo
{
	public static void main(String args[])
	{
		Rectangle R=new Rectangle(10,20);
		R.display();
		Triangle T=new Triangle(10,20);
		T.display();
		double ra=R.area();
		double ta=T.area();
		System.out.println("rectangle area"+ra);
		System.out.println("triangle area"+ta);
		
	}
}
		
		