import java.io.*;

class Animal

{
	String col="white";
	
public Animal(){ System.out.println("Animal colors"); }


public void eat() { System.out.println("Animal eats"); }

}
class cat extends Animal{
	
	String col="black";
	
public cat() { System.out.println("color:" +col); }

public void eat() { System.out.println("color:" +super.col); }
 


}
class Sin2
{
	public static void main(String args[])
	{
	cat c1=new cat();
	
	c1.eat();
	}
}

