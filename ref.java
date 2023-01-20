import java.io.*;
import java.lang.*;
class student
{
public void marks(int a)
{
System.out.println("marks::\n" +a);
}
}
class num
{
int x;
}
class ref
{
public static void main(String args[])
{
student m=new student();
num n=new num();
n.x=56;
m.marks(n.x);
n.x=47;
m.marks(n.x);
n.x=32;
m.marks(n.x);
}
}
