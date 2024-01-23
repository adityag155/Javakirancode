package adiiapplication;

class Lab3 {

    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
       
    public void show1() {
        System.out.println("variable & constant demo");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }

    public static void main(String args[]) {
        Lab3 l3 = new Lab3();

        l3.show1();
    }
}

/*
 * O/P:
 * variable & constant demo
0
0
0
0
0.0
0.0
*/
