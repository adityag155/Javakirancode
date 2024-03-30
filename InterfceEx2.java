interface CusterRaju
{
int amt=5;
void purchase();
}
class SellerAju implements CusterRaju
{
public void purchase()
{
System.out.println("Raju need" +amt+ "kg rice");
}
}
class InterfceEx2
{
public static void main(String args[])
{
CusterRaju cr=new SellerAju();
cr.purchase();
System.out.println(CusterRaju.amt);			//Print 5 bcz its static var
}
}

/*
O/P:
Raju need5kg rice
*/