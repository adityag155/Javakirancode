public class Hello {
    int i;
    int c = 20;
    static int b;

    {
        for (int i = 0; i < 5; i++) {
            System.out.println("I+" + i);
        }
        int x = 10;
    }

    static {
        int y = 20;
        int x = 1;
    }

    Hello() {
        int z = 30;
    }

    void m1(int r) {
        int c = 40;
    }

    static void m2(int r) {
        int d = 50;
    }

    public static void main(String[] args) {

Hello h=new Hello();
System.out.println(h.c);
System.out.println(h.i);

    }
}
/*
O/P:
I+0
I+1
I+2
I+3
I+4
20
0
*/
