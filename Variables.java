class Variables
{
static int b=20;					//static variable
int c=30;						//Instance variable

public static void main(String args[])
{
int a=10;						//local variable
Variables var=new Variables();
System.out.println(a);
System.out.println(Variables.b);
System.out.println(var.c);
}
}	
/*
O/P:
10
20
30
*/


//Local variable access directly
//Static variable access with class name
//Instance variables access with the help of class Object