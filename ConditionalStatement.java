package adiiapplication;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=2;
		int c=10;
		
		if((a<b)&&(a<c)) {
			System.out.println("Min:"+a);
		}else if(b<c)
		{
			System.out.println("Min:"+b);
		}
		else
		{
			System.out.println("Min:"+c);
		}
		
	}

}

/*
O/P:
Min:1
*/