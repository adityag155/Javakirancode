//Inheritance

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

class CDTest
{
public static void main(String args[])
{
D d=new D();

//System.out.println(d.a);

System.out.println(d.b);			//30

System.out.println(d.c);			//10
}
}

/*
O/P:
30
10
*/