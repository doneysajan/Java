import java.io.*;

class Read13
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String s=br.readLine();
		System.out.println("string is::\t"+s);
	}
}