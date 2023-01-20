import java.io.*;
class Dir5
{
	public static void main(String args[])
	{
		try
		{
			File f = new File("eee");
			boolean s = f.mkdirs();
			if(s)
			{
				System.out.println("directory created");
			}
			else
			{
				System.out.println("directory not found");
			}
		}
         catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}
}