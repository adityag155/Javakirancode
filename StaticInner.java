class StaticInner {
    static class A {
        static int a = 10;
        int b = 20;

        void display() {
            System.out.println("This is local method");
        }

        static void show() {
            int c = 63;
            System.out.println("This is static method");
        }
    }

    public static void main(String args[]) {
        StaticInner.A si = new StaticInner.A(); // Corrected instantiation for static inner class
        System.out.println(si.b);
        System.out.println(StaticInner.A.a); // Accessing static variable using the class name
        si.display();
        StaticInner.A.show(); // Accessing static method using the class name
    }
}
/*
O/P:
20
10
This is local method
This is static method
*/