class Student
{
int id;
String name;
String email;
long phone;

Student(int i, String n, String em, long ph)
{
id=i;
name=n;
email=em;
phone=ph;
}
void display()
{
System.out.println(id+" "+name+" "+email+" "+phone);
}
}

class ParametrzdConst
{
public static void main(String args[])
{
Student s1=new Student(111,"Aneesh","an@gmail.com",12345);
Student s2=new Student(112,"Sourabh","so@gmail.com",67890);
s1.display();
s2.display();
}
}

/*
O/P:
111 Aneesh an@gmail.com 12345
112 Sourabh so@gmail.com 67890
*/