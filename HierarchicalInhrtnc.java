class A
{
public void methodA()
{
System.out.println("Method of class A");
}
}
class B extends A
{
void methodB()
{
System.out.println("Method of class B");
}
}

class C extends A
{
void methodC()
{
System.out.println("Method of class C");
}
}

class D extends A
{
void methodD()
{
System.out.println("Method of class D");
}
}


class HierarchicalInhrtnc
{
void methodB()
{
System.out.println("method of class B");
}
public static void main(String args[])
{
B obj1=new B();
C obj2=new C();
D obj3=new D();

obj1.methodA();
obj2.methodA();
obj3.methodA();

obj1.methodA();
obj2.methodC();
obj3.methodD();

}
}

/*
O/P:
Method of class A
Method of class A
Method of class A


Method of class A
Method of class C
Method of class D
*/