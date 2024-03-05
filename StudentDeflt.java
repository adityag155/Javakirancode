class StudentDeflt
{
int id;
String name;
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
StudentDeflt sd1=new StudentDeflt();
StudentDeflt sd2=new StudentDeflt();

sd1.display();
sd2.display();
}
}
/*
O/P:
0 null
0 null
*/