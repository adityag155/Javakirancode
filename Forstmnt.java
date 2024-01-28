//WAP to read no. from command line & display 5 divisible from 1 to given number

package adiiapplication;

public class Forstmnt {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int n=67;
		System.out.println("Forword order");
		for(int i=1;i<=n;i++)
		{
			if(i%5==0)
				System.out.println(i);
		}
	}
}

/*
O/P:
Forword order
5
10
15
20
25
30
35
40
45
50
55
60
65
*/
