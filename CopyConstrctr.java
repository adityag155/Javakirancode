class CopyConstrctr
{
int id;
String name;

CopyConstrctr(int i, String n)
{
id=i;
name=n;
}

CopyConstrctr(CopyConstrctr s)
{
id=s.id;
name=s.name;
}

void display()
{
System.out.println(id+" "+name);
}

public static void main(String args[])
{
CopyConstrctr cc1=new CopyConstrctr(20,"Karan");
CopyConstrctr cc2=new CopyConstrctr(30,"Terrance");
CopyConstrctr cc3=new CopyConstrctr(cc2);

cc1.display();
cc2.display();
cc3.display();
}
}

/*
O/P:
20 Karan
30 Terrance
30 Terrance
*/