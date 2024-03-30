import java.util.Scanner;
interface Client
{
void input();
void output();
}
class Intrfce implements Client
{
String name;
double sal;
public void input()
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter username");
name=sc.nextLine();

System.out.println("Enter salary");
sal=sc.nextDouble();
}

public void output()
{
System.out.println(name+" "+sal);
}
public static void main(String args[])
{
Client c=new Intrfce();
c.input();
c.output();
}
}

/*
O/P:
Enter username
Aditya
Enter salary
50000
Aditya 50000.0
*/