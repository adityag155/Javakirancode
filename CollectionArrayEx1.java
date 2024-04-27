import java.util.*;
class CollectionArrayEx1
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
al.add("aa");
al.add("bb");
al.add("cc");
System.out.println(al);						//print list

System.out.println(al.add("dd"));				//True

//al.size();
System.out.println(al.size());					//4=[Size of list]

System.out.println(al.isEmpty());				//false

System.out.println("Iteration of ArrayList by for loop");
for(int i=0; i<al.size();i++)
System.out.println(al.get(i));

System.out.println("iteration of ArrayList by iterator");
Iterator itr=al.iterator();
while(itr.hasNext())
{
Object o=itr.next();
String s=(String)o;
System.out.println(s);
}
}
}

/*
O/P:
import java.util.*;
class CollectionArrayEx1
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
al.add("aa");
al.add("bb");
al.add("cc");
System.out.println(al);						//print list

System.out.println(al.add("dd"));				//True

//al.size();
System.out.println(al.size());					//4=[Size of list]

System.out.println(al.isEmpty());				//false

System.out.println("Iteration of ArrayList by for loop");
for(int i=0; i<al.size();i++)
System.out.println(al.get(i));

System.out.println("iteration of ArrayList by iterator");
Iterator itr=al.iterator();
while(itr.hasNext())
{
Object o=itr.next();
String s=(String)o;
System.out.println(s);
}
}
}

/*
O/P:
[aa, bb, cc]
true
4
false
Iteration of ArrayList by for loop
aa
bb
cc
dd
iteration of ArrayList by iterator
aa
bb
cc
dd
*/