package adiiapplication;

public class SingleInhrtnc
{
void methodA()
{
	System.out.println("Base class Method");
}
}	
class B extends SingleInhrtnc
{
	void methodB() {
		System.out.println("Childclass Method");
	}	
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

		B obj=new B();
		obj.methodA();
		obj.methodB();
		
		
		
	}

}
/*
 * O/P:
false
false
true



Expected O/P:
Base class Method
Child class Method
 */
