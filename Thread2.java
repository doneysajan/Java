import java.lang.*;
class CCC extends Thread
	{
		String nm;
		CCC(String name)
		{
			nm=name;
		}
		public void run()
		{
			System.out.println("Running" +nm);
			try{
				for(int i=5;i>0;i--)
				{
					System.out.println(i);
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
	
	class Thread2
	{
		public static void main(String args[])
		{
	AAA a=new AAA("A");
   
    a.start();
	
	CCC c=new CCC("C");
	c.start();
        }
    }