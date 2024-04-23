class Hai
{
public void finalize()
{
System.out.println("Hi Finalize()");
}
}
class A
{
void show()
{
Hello h1=new Hello();
h1.m1();
Hello h2=new Hello();
h2.m1();
System.runFinalization();
System.gc();
}

public void finalize()
{
System.out.println("A-Finalze()");
}
}

class Hello
{
void m1()
{
System.out.println("m1-begin");
Hai h1=new Hai();
Hai h2=new Hai();
Hai h3=new Hai();

System.out.println("m2-begin");
System.runFinalization();
System.gc();
Hai h4=new Hai();
System.out.println("m2-end");
}

public void finalize()
{
System.out.println("Hello Finalize()");
}
}

class GarbageExm
{
public static void main(String args[])
{
A obj=new A();
obj.show();
System.runFinalization();
System.gc();
}
}


/*
O/P:
m1-begin
m2-begin
m2-end
m1-begin
m2-begin
m2-end
Hi Finalize()
Hi Finalize()
Hi Finalize()
Hi Finalize()
Hi Finalize()
Hi Finalize()
Hi Finalize()
Hi Finalize()
Hello Finalize()
Hello Finalize()
*/
