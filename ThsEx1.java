class A
{
int a=10;
}
class B extends A
{
int a=20;
}
class C extends A
{
int a=30;
}
class D extends C
{
int a=40;
void m1()
{
int a=50;
System.out.println("This is aditya's code");
System.out.println(a);
System.out.println(this.a);
//System.out.println(super.b);

B b=new B();
System.out.println(b.a);
A a1=new A();
System.out.println(a1.a);
}
}
class ThsEx1
{
public static void main(String args[])
{
D d1=new D();
d1.m1();
}
}


/*
O/P:
This is aditya's code
50
40
20
10*/