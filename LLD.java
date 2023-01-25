import java.io.*;
import java.util.*;
class LLD
{
public static void main(String args[])
{
LinkedList <String>ll=new LinkedList <String>();
ll.add("A");
ll.add("B");
ll.add("C");
ll.add("D");

for(String a:ll)
{
System.out.println(a);
}

System.out.println("The size of the element"+ll.size());
ll.addFirst("first");
ll.addLast("last");

System.out.println("new ll is");

for(String a:ll)
{
	System.out.println(a);
	
}
Object el=ll.get(1);
System.out.println("First element el is::" +el);

}
}
