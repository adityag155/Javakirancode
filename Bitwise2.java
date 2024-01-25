package adiiapplication;

public class Bitwise2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int a=19;
		System.out.println(a>>1);	//Right Shift opeator
		
		int x=15;
		int y=6;
		
		System.out.println(x&y);	//Bitwise AND
		
		System.out.println(x|y);	//OR
		
		System.out.println(x^y);	//XOR
		
		System.out.println(~x);		//NOT
	
		System.out.println(~500);
		
		System.out.println(0101<<1);
		
		System.out.println(0101>>1);
		
	}

}

/*
 * O/P:
 * 9
6
15
9
-16
-501
130
32
*/
