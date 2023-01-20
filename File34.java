import java.io.*;
class File34
{
	public static void main(String args[])
	{
	try
	{
       char ch;
       int i;
       int n=0;
       FileInputStream fin=new FileInputStream("file34.txt");
       i=fin.read();
       while(i!=-1)
           {
	         char c =(char)i;
	         System.out.println(c);
	         if(c=='a')
	           n++;
		         i=fin.read();
	                    
	        System.out.println(n);
            
		   }
	}catch(Exception e)
	{
      System.out.println(e);
    }
}
}
	
