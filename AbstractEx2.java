abstract class Bank
{
abstract int getRateofIntrest();
}

class SBI extends Bank
{
int getRateofIntrest(){return 7;}
}

class BOM extends Bank
{
int getRateofIntrest(){return 8;}
}

class AbstractEx2
{
public static void main(String args[])
{
Bank b;
b=new SBI();
System.out.println("Rate of Intrest is:"+b.getRateofIntrest()+"%");

b=new BOM();
System.out.println("Rate of Intrest is:"+b.getRateofIntrest()+"%");
}
}

/*
O/P:
Rate of Intrest is:7%
Rate of Intrest is:8%
*/