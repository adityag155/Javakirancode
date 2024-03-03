public class StaticInstncMeth
{
int a=10;
static int b=20;
void jbk()
{
System.out.println("Hello JBK");
System.out.println(a);
System.out.println(b);
}
static void adi()
{
System.out.println("Hello jbk");
System.out.println(b);
}
public static void main(String args[])
{
//StaticInstance si = new StaticInstance();
StaticInstncMeth si = new StaticInstncMeth();

System.out.println(si.a);
System.out.println(si.b);
//si.adi();     			//if we call adi method in main method thn it printed
}
}
/*
O/P:
10
20
*/