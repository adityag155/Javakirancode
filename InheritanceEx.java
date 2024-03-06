

class A
{
int a = 10;
int b = 20;

void m1()
{
System.out.println("I am A-m1");
}

void m2()
{
System.out.println("I am A-m2");
}
}

class B extends A
{
int b = 30;
int c = 40;

void m2()
{
System.out.println("I am B-m2");
}

void m3()
{
System.out.println("I am B-m3");
}
}

public class InheritanceEx
{
public static void main(String args[])
{
A a = new A();
System.out.println(a.a);
System.out.println(a.b);
a.m1();
a.m2();
}
}