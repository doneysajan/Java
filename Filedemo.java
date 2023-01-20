import java.io.*;
class Filedemo
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("filedemo.txt");
int i=fin.read();
char c=(char)i;
System.out.println(c);
}
catch(IOException e)
{
	System.out.println(e);

}
}
}