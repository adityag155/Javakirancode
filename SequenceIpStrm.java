//SequenceInputStream class:

import java.io.*;
class SequenceIpStrm
{
public static void main(String args[])
{
try
{
String path1="C:\\Aditya\\JavaKiran\\Adi.txt";
String path2="C:\\Aditya\\JavaKiran\\Adu.txt";

FileInputStream fis1=new FileInputStream(path1);
FileInputStream fis2=new FileInputStream(path2);

SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
int i;
while((i=sis.read())!=-1)
System.out.print((char)i);
}
catch(Exception e)
{
System.out.println(e);
}
}
}

/*
O/P:
Hello Aditya This side
Welcome to java program
*/

//In this data from two different file will be read from the SequenceInputStream class