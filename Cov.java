import java.io.*;
class A
{
void disp(){
System.out.println("aaaa");
}
}
class B extends A
{
void disp()
{
System.out.println("BBBB");
}
}
class Cov
{
public static void main(String args[])
{
A.a=new A();
a.disp();
B.b=new B();
b.disp();
}
}