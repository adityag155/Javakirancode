class StaticVar
{
int a=10;
static int b=10;
public static void main(String args[])
{
StaticVar sv = new StaticVar();
System.out.println(sv.a);
System.out.println(sv.b);

StaticVar sv1 = new StaticVar();
System.out.println(sv1.a++);
System.out.println(sv1.b++);

StaticVar sv2 = new StaticVar();
System.out.println(sv2.a++);
System.out.println(sv2.b++);

StaticVar sv3 = new StaticVar();
System.out.println(sv3.a++);
System.out.println(sv3.b++);

StaticVar sv4 = new StaticVar();
System.out.println(sv4.a++);
System.out.println(sv4.b++);

}
}

/*
O/P:
10
10
10
10
10
11
10
12
10
13
*/

