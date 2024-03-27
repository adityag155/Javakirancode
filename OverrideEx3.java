class Shape
{
void draw()
{
System.out.println("Cant say shape type");
}
}

class Square extends Shape
{

void draw()
{
super.draw();						//we can call superclass method using super 
System.out.println("Square shape");
}
}

class OverrideEx3
{
public static void main(String args[])
{
Shape r=new Square();
r.draw();
}
}

/*
O/P:
Cant say shape type
Square shape
*/