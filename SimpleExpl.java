package adiiapplication;

public class SimpleExpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=2; i++) {
			JBK:for(int j=1; j<=2; j++) {
				for(int k=1; k<=2; k++) {
					if(k<=3)
						System.out.println(k+"\t");
					else
						break JBK;
	}
	System.out.println("JBK");	
	}
System.out.println("*");
}
System.out.println("Done");
}
}

/*
O/P:
1	
2	
JBK
1	
2	
JBK
*
1	
2	
JBK
1	
2	
JBK
*
Done
*/