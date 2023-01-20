import java.io.*;
class DirDemo1
{
	public static void main(String args[])
	{
		try
		{
			File f = new File("aaa//aa//a");
			boolean s = f.mkdirs();
			if(s)
			{
				System.out.println("directory created");
			}
			else
			{
				System.out.println("directory does not exists");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

	