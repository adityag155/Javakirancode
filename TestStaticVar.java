class Student
{
int roll_no;
String name;
static String college="GPP";
Student(int r, String n)
{
roll_no=r;
name=n;
}

void display()
{
System.out.println(roll_no + " " + name + " " + college);
}
}

class TestStaticVar
{
public static void main(String args[])
{
Student s1= new Student(111,"Anurag");
Student s2= new Student(112,"Aditya");
s1.display();
s2.display();
}
}
/*
O/P:
111 Anurag GPP
112 Aditya GPP
*/