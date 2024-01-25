package adiiapplication;

public class ConditionalStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=45;
		int c=30;
		
		if((a>b)&&(a>c))
		{
			System.out.println("Max:"+a);
		}
		else if(b>c)
		{
			System.out.println("Max:"+b);
		}
		else
		{
			System.out.println("Max:"+c);
		}
	}

}
