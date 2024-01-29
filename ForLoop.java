// WAP to read two no. from command line & prints all prime no. between that two 
package adiiapplication;

public class ForLoop {

	static Boolean isPrime(int n)
	{
		int count=0;
		for (int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=3;
		int n=30;
		for(int i=m;i<=n;i++)
		{
			Boolean b=isPrime(i);
			if(b)
			{
				System.out.println(i);
			}
		}
	}
}

/*
 * O/P:
 * 3
5
7
11
13
17
19
23
29
*/
 */

