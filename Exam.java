import java.io.*;
import java.lang.*;
class student
{
public void marks(int a)
{
System.out.println("marks"+a);
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
Student m=new student();
num n=new num();
n.x=10;
m.marks(n.x);
m.x=20;
m.marks(n.x);
n.x=30;
m.marks(n.x);
}
}
