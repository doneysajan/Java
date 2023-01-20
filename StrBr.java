import java.io.*;
public class StrBr
{
public static void main(String args[])
{
	try
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s=br.readLine();
		System.out.println("string is"+s);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
}
}