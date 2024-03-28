abstract class Animal
{
Animal()
{
System.out.println("All Animals");
}
public abstract void sound();
}

class Dog extends Animal
{
Dog()
{
super();
}
public void sound()
{
System.out.println("Dog is barking");
}
}

class Lion extends Animal
{
Lion()
{
super();
}
public void sound()
{
System.out.println("Lion is Roaring");
}
}

class AbstrctEx
{
public static void main(String args[])
{
Dog d=new Dog();
Lion l=new Lion();

d.sound();
l.sound();
}
}

/*
O/P:
All Animals
All Animals
Dog is barking
Lion is Roaring
*/