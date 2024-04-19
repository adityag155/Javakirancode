package adiiapplication;

import java.util.ArrayList;
public class JavaCollectiion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList Name=new ArrayList();
		Name.add("Ankit");						//Make list
		Name.add("Karan");
		Name.add("Arjun");
		
		System.out.println(Name);				//Add in list
		Name.add("Anish");
		System.out.println(Name);
		
		Name.add(1, "Anurag");					//Add at specific position
		System.out.println(Name);
		
		Name.add(0, "Rushi");					//Add at begining
		System.out.println(Name);
		
		Name.remove(1);							//Remove from list
		System.out.println(Name);
		
		Name.set(0, "Anish");					//Update or replace
		System.out.println(Name);
		
		System.out.println(Name.get(0));		//print specific
		
	}
}

/*
O/P:
[Ankit, Karan, Arjun]
[Ankit, Karan, Arjun, Anish]
[Ankit, Anurag, Karan, Arjun, Anish]
[Rushi, Ankit, Anurag, Karan, Arjun, Anish]
[Rushi, Anurag, Karan, Arjun, Anish]
[Anish, Anurag, Karan, Arjun, Anish]
Anish
*/