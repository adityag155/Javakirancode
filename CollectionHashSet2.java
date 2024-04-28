import java.util.*;

class CollectionHashSet2
{
public static void main(String args[])
{
HashSet<String> hs=new HashSet<>();
hs.add("Sourabh");
hs.add("Aneesh");
hs.add("Aneesh");				                        	//No duplication
hs.add("Ajith");
System.out.println(hs.size());
System.out.println(hs);

Iterator<String> itr = hs.iterator();
while (itr.hasNext())
System.out.println(itr.next());
}
}

/*
O/P:
3
[Ajith, Aneesh, Sourabh]
Ajith
Aneesh
Sourabh
*/
