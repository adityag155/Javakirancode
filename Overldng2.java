class Arithmatic {
    void sum(int a) {
        System.out.println(a + a);
    }
    void sum(double a) {
        System.out.println(a + a);
    }
    void sum(double a, double b) {
        System.out.println(a + b);
    }
    void sum(double a, int b) {
        System.out.println(a + b);
    }
}
class Overldng2 {
    public static void main(String args[]) {
        Arithmatic ar = new Arithmatic();
        ar.sum(10);
        ar.sum(10.5);
        ar.sum(10.5, 20.5);
        ar.sum(10.5, 20); // This line will call sum(double a, int b)
    	ar.sum(10, 20); // This line will call sum(int a)
    }
}

/*
O/P:
20
21.0
31.0
30.5
30.0
*/