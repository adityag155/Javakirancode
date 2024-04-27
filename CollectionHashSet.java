import java.util.*;

class CollectionHashSet
{
public static void main(String args[])
{
HashSet hs=new HashSet();
hs.add("aaa");
hs.add("bbb");
hs.add("aaa");
hs.add("ccc");

System.out.println(hs.size());

System.out.println(hs);

Iterator<String> itr=hs.iterator();
while(itr.hasNext())
System.out.println(itr.next());
}
}

/*
O/P:
3
[aaa, ccc, bbb]
aaa
ccc
bbb
*/