package adiiapplication;

import java.util.*;
public class JavaCollectiionLinkdlst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> Name=new LinkedList<String>();
		
		Name.add("Sourabh");
		Name.add("Ganesh");
		Name.add("Ayush");
		
		System.out.println(Name);			//Print list
		
		for(String str:Name)				//print in seprate line
		{
			System.out.println(str);
		}
		
		Name.addFirst("Omkar");				//Add at start
		System.out.println(Name);
		
		Name.addLast("Shubham");			//Add at last
		System.out.println(Name);
		
		Name.add(2, "Ajith");				//Add at specific position
		System.out.println(Name);
		
		Name.remove(4);						//remove form specific position
		System.out.println(Name);
		
		Name.removeFirst();					//remove 1st
		System.out.println(Name);
		
		Name.removeLast();					//remove last
		System.out.println(Name);
	}

}

/*
O/P:
[Sourabh, Ganesh, Ayush]
Sourabh
Ganesh
Ayush
[Omkar, Sourabh, Ganesh, Ayush]
[Omkar, Sourabh, Ganesh, Ayush, Shubham]
[Omkar, Sourabh, Ajith, Ganesh, Ayush, Shubham]
[Omkar, Sourabh, Ajith, Ganesh, Shubham]
[Sourabh, Ajith, Ganesh, Shubham]
[Sourabh, Ajith, Ganesh]
*/