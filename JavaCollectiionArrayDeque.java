package adiiapplication;

import java.util.*;
public class JavaCollectiionArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<String> Name=new ArrayDeque();		//FIFO
		
		Name.push("Kunal");
		Name.push("Vaibhav");
		Name.push("Avneesh");
		
		System.out.println(Name);
		
		Name.pop();							//to remove
		System.out.print(Name);

	}

}
