class StaticClass {
    static class JDKWay {
        static int a = 10;
        int b = 20;

 void display() {
            System.out.println("This is local method");
        }

static void show() {
            int c = 63;
            System.out.println("This is static method");
            System.out.println("C=" + c); // Corrected the println statement
        }
    }


 public static void main(String args[]) {
        StaticClass.JDKWay a1 = null; // Corrected the variable name and instantiation
        System.out.println(a1.a);
        a1.show(); // Corrected the method invocation
    }
}
/*
O/P:
10
This is static method
C=63
*/


