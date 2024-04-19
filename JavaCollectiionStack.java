package adiiapplication;

import java.util.*;
public class JavaCollectiionStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> Name=new Stack();			//LIFO
		Name.push("Kedar");
		Name.push("Saransh");
		Name.push("Akshay");
		
		System.out.println(Name);
		
		Name.pop();								//to remove
		System.out.println(Name);
	}

}

/*
O/P:
[Kedar, Saransh, Akshay]
[Kedar, Saransh]

*/