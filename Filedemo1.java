import java.io.*;
class Filedemo1
{
public static void main(String args[])
{
try
{
File f=new File("aaa");
String s[]=f.list();
for(int i=0;i<s.length;i++)
{
System.out.println(s[i]);
}
}

catch(IOException e)
{
	System.out.println(e);

}
}
}