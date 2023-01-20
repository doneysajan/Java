import java.io.*;
import java.lang.*;

class studentmark
{
public void marks(int a)
{
System.out.println("marks of Students::\n" +a);
}
}
class test
{
int x;
}
class ref1
{
public static void main(String args[])
{
studentmark m=new studentmark();
test n=new test();
int z;
try{
DataInputStream dis=new DataInputStream(System.in);
for(int i=0;i<3;i++)
{
z=Integer.parseInt(dis.readLine());
System.out.println("Enter the marks of");
n.x=z;
m.marks(z);
}
}catch(IOException e){
System.out.println(e);
}
}
}
