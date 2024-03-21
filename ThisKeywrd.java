class Person
{
int age=45;
}

class Employee extends Person
{
int age=29;
void insertStudent()
{
int age=24;
System.out.println(age);
}
}

class ThisKeywrd
{
public static void main(String args[])
{
Person p1=new Person();
System.out.println(p1.age);				//45

Employee e1=new Employee();
System.out.println(e1.age);				//29
System.out.println(((Person)e1).age);			//45
e1.insertStudent();					//24
}
}

/*
O/P:
45
29
45
24
*/