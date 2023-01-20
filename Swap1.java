import java.io.*;
class Num
{
public static void swapfn(int a,int b)
{
System.out.println("inside function before swap a::" +a +"b::"+b);
int c=a;
a=b;
b=c;
System.out.println("inside function after swap a::" +a +"b::"+b);
}
}
class Swap1{
public static void main(String args[])
{
int a=10;
int b=30;
System.out.println("inside function before swap a::"+a +"b::"+b);
Num N=new Num();
N.swapfn(a,b);
System.out.println("inside function before swap a::"+a +"b::"+b);

}
}