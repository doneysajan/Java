import java.io.*;
class Filedemo3
{
public static void main(String args[])
{
try
{
	char c;
	int i;
	int n=0;
FileInputStream fin=new FileInputStream("filedemo.txt");
 i=fin.read();
 while(i!=-1)
 {
	 c=(char)i;

System.out.println(c);
 i=fin.read();
}
}
catch(Exception e)
{
	System.out.println(e);

}
}
}

