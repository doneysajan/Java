import java.io.*;
class Test
{
public Test() { System.out.println("Test cons-no args"); }

public Test(int a) { System.out.println("Test cons-one args"); }
{
System.out.println("Instance intialization block");
}
}
class Sin3
{
public static void main(String args[])
{
Test t1=new Test();
Test t2=new Test(10);
}
}
