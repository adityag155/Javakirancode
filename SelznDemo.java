import java.io.*;

class Student implements Serializable
{
int stuRollNo;
String stuName;
}

class SelznDemo
{
public static void main(String args[])throws IOException
{
Student s1=new Student();
s1.stuRollNo=4;
s1.stuName="Anu";

FileOutputStream fos=new FileOutputStream("India.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);

oos.writeObject(s1);

}
}