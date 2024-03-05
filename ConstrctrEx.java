class A
{
int a; 
String name;
A()
{
a=22;
name="Vishal";
}
void show()
{
System.out.println(a+" "+name);
}
}
class ConstrctrEx
{
public static void main(String args[])
{
A ref = new A();
ref.show();
}
}

/*
O/P:
22 Vishal
*/