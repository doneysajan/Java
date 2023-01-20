import java.io.*;
class Areacircle
{
public static void main(String str)
{
String str;
int r;
double area;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enter radius");
str=din.readLine();
r=Integer.parseInt(str);
area=3.14*r*r;
System.out.println("Radius is"+r);
}
catch(Exception e) { System.out.println("Error"+e);  }
}
}