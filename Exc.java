import java.io.*;
class Exc
{
public static void main(String rags[])
{
try
{
int i=20/0;
System.out.println("i is "+i);
}

catch(ArithmeticException e) {
System.out.println(e);
}
}
}