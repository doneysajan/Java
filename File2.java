import java.io.*;
class File2
{
public static void main(String args[])
{
try
{
FileOutputStream f1=new FileOutputStream("Test133.txt");
System.out.println("File created");
}

catch(IOException e)
{
System.out.println(e);

}
}
}