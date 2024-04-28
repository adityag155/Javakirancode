import java.util.*;

class CollectionHashmap
{
public static void main(String args[])
{
HashMap<String, String> hm=new HashMap<>();
hm.put("101","Adi");
hm.put("102","Anu");

Object o=hm.put("103","Abhi");
System.out.println(o);
System.out.println(hm);

Object o1=hm.put("103","Omkar");					//print previous value
System.out.println(o1);

System.out.println("====By Using Iterator");
Set s=hm.keySet();
Iterator itr=s.iterator();
while(itr.hasNext())
{
String key=(String)itr.next();
System.out.println("Key="+key);
System.out.println("Value="+hm.get(key));
}
}
}

/*
O/P:
null
{101=Adi, 102=Anu, 103=Abhi}
Abhi
====By Using Iterator
Key=101
Value=Adi
Key=102
Value=Anu
Key=103
Value=Omkar
*/