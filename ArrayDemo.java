
import java.io.*;
class ArrayDemo
{
public static void main(String  args[])
{
int a[];
int n,i;
DataInputStream din= new DataInputStream(System.in);
try
{
System.out.println("Enter the size of the array");
n=Integer.parseInt(din.readLine());
a=new int [n];
System.out.println("Enter elemnts into the array");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(din.readLine());
}
System.out.println("The array elements are");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
catch(Exception e) { System.out.println("error"+e); }
}
}

