import java.io.*;
class FileMeth
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