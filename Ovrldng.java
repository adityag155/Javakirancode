class Ovrldng
{
void add()
{
int a=10, b=20, c;
c=a+b;
System.out.println(c);
}

void add(int x, int y)
{
int c;
c=x+y;
System.out.println(c);
}

void add(int x, double y)
{
double c;
c=x+y;
System.out.println(c);
}
public static void main(String args[])
{
Ovrldng or=new Ovrldng();
or.add();
or.add(20,30);
or.add(40, 50.65);
}
}

/*
O/P:
30
50
90.65
*/