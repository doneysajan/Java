import java.lang.*;
class AAA extends Thread
{
String nm;
AAA(String name)
{
nm=name;
}
public void run()
{
System.out.println("Running"+nm);
try
{
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
class Thread1
{
public static void main(String args[])
{
AAA a=new AAA("Thread a");
a.start();
}
}
