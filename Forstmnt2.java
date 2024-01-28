//WAP to read no. from command line & display 5 divisible from 1 to given number

package adiiapplication;

public class Forstmnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=67;
		System.out.println("Reverse order");
		for(int i=n;i>=1;i--)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}

}
/*
O/P:
Reverse order
65
60
55
50
45
40
35
30
25
20
15
10
5
*/
