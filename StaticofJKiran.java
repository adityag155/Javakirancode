class StaticofJKiran
{
static int i=10;
public static void main(String args[])
{
StaticofJKiran javaKiran = new StaticofJKiran();
System.out.println(javaKiran.i);			//called by object
System.out.println(StaticofJKiran.i);			//called by class name
}
}

/*
O/P:
10
10
*/