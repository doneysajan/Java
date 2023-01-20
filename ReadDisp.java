import java.io.*;
class Num
{
int n1;
String str;
void read()
{
	DataInputStream din;
	din=new DataInputStream(System.in);
	try
	{
		System.out.println("Enter the number n");
		str=din.readLine();
		n1=Integer.parseInt(str);
	}
	catch (Exception e) { System.out.println("Error" +e);
}
}


void disp()
{
	System.out.println("The number is:"+n1);
	
}
}


class ReadDisp
{
public static void main(String args[])
{
Num n=new Num();
n.read();
n.disp();
}
}