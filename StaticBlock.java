class StaticBlock {
    StaticBlock() {
        System.out.println("This is constructor");
    }

    {
        System.out.println("This is non-static block");
    }

    static {
        System.out.println("This is static block");
    }

    void displayStaticBlock() {
        System.out.println("This is a method");
    }

    public static void main(String args[]) {
        StaticBlock s = new StaticBlock();
        StaticBlock s2 = new StaticBlock();
        s.displayStaticBlock();
    }
}

/*
O/P:
This is static block
This is non-static block
This is constructor
This is non-static block
This is constructor
This is a method
*/
