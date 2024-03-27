class Animal
{
public void eat()
{
System.out.println("I can eat");
}
}

class Dog extends Animal
{

public void eat()
{
System.out.println("Eat dog food");
}
public void bark()
{
System.out.println("I bark");
}
}

class Override
{
public static void main(String args[])
{
Dog dg=new Dog();
dg.eat();
dg.bark();

/*
Animal an=new Animal();					//To call Animal method
an.eat();
*/
}
}

/*
O/P:
Eat dog food
I bark
*/