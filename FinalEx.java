class FinalEx{
final int a=10;
final void JBK()
{
final int limit = 5;
for(int i=0;i<limit;i++)
{
System.out.println("Value of I="+i);
}
}

public static void main(String args[]) {
FinalEx fe = new FinalEx();
fe.JBK();
System.out.println(fe.a);
}
}

/*
O/P:
Value of I=0
Value of I=1
Value of I=2
Value of I=3
Value of I=4
10
*/