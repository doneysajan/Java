import java.io.*;
class File
{
public static void main(String args[])
{
try
{
FileOutputStream f=new FileOutputStream("test2.txt");
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter the text into files .. terminate with $");
while(true)
{
	String dt=dis.readLine();
	if(dt.equals("$"))
		break;
	else
		f.write(dt.getBytes());
f.write(dt.getBytes());
}

}catch(IOException e)
{
	System.out.println(e);
}
}
}


