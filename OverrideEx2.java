class A
{
void m1()
{
System.out.println("A-m1");
}
}

class B extends A
{
void m1()
{
System.out.println("B-m1");
}
void m3()
{
System.out.println("B-m3");
}
}

class OverrideEx2
{
public static void main(String args[])
{
B obj=new B();
obj.m1();
obj.m3();
}
}

/*
O/P:
B-m1
B-m3
*/