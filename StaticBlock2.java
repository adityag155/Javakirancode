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