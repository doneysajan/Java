import java.io.*;
class Fcmeth
{
public static void main(String args[])
{
try
{
File f1=new File("test3.txt");
boolean fc=f1.createNewFile();
if(fc)
{
System.out.println("File created");
}
else
{
	System.out.println("File not created");
	
}
}
catch(IOException e)
{
System.out.println(e);

}
}
}
