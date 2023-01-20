import java.io.*;
class File4
{
public static void main(String args[])
{
try
{
	Path pf=Paths.get("E:\javaprograms\\test157.txt");
	Path p=Files.createFile(pf);
}


catch(IOException e)
{
System.out.println(e);

}
}


}