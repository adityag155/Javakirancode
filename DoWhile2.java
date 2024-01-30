package adiiapplication;

public class DoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=20;
		System.out.println("do while");
		int i=1;
		do {
			if(i%5==0)
			{
				System.out.println(i);
			}
			i++;
			System.out.println("ok"+i);
		}while(i<n);
		}

}
/*
 * O/P:
 * do while
ok2
ok3
ok4
ok5
5
ok6
ok7
ok8
ok9
ok10
10
ok11
ok12
ok13
ok14
ok15
15
ok16
ok17
ok18
ok19
ok20
*/
