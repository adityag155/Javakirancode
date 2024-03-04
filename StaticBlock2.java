class StaticMethod
{
static int i=10;
int b=20;
void display()
{
System.out.println("This is display method");
}
static void show()
{
System.out.println("Aditya From Pune");
}
{
display();
}
static
{
System.out.println(i);
}
}
class StaticBlock2{
public static void main(String args[])
{
StaticMethod sm=new StaticMethod();
{
sm.display();
sm.show();
StaticMethod sm1=null;
sm1.show();
//System.out.println(sm.i); 					//It print 10
//System.out.println(sm.b);					//It print 20


//System.out.println(sm1.i); 					//It print 10
//System.out.println(sm1.b);					//It give error at runtime

}
}
}

/*
O/P:
This is display method
This is display method
Aditya From Pune
Aditya From Pune
*/