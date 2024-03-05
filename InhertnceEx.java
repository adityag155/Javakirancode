class A
{
int age;
int loc;
}

class B extends A
{
int pancard;
}
class C
{
private int a=20;

public int b=30;

public int c=40; 
}

class D extends C
{
public int c=10;
}

class InhertnceEx
{
public static void main(String args[])
{
D d=new D();

//System.out.println(d.a);
 
System.out.println(d.b);

System.out.println(d.c);
}
}