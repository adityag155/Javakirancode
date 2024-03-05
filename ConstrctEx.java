class Student
{
int sid;
String sname;
String email;
long phone;

 Student() {
    }


Student(int id, String sn, String em, long ph)
{
sid=id;
sname=sn;
email=em;
phone=ph;
}
String show()
{
        return "ID: " + sid + "\nName: " + sname + "\nEmail: " + email + "\nPhone: " + phone + "\n";
    }
}
public class ConstrctEx
{
public static void main(String args[])
{

Student s1 = new Student();
        System.out.println("Student 1:");
        System.out.println(s1.show());


Student s2 = new Student(101, "Anu", "anu@gmail.com", 123450);
        System.out.println("Student 2:");
        System.out.println(s2.show());

Student s3 = new Student(102, "Ajith", "aji@gmail.com", 98765430);
        System.out.println("Student 3:");
        System.out.println(s3.show());
}
}
/*
O/P:
Student 1:
ID: 0
Name: null
Email: null
Phone: 0

Student 2:
ID: 101
Name: Anu
Email: anu@gmail.com
Phone: 123450

Student 3:
ID: 102
Name: Ajith
Email: aji@gmail.com
Phone: 98765430
*/
