class TestVarEx {
    private int var = 90;

    // Getter method to access the private variable
    public int getVar() {
        return var;
    }
}

class VarEx {
    public TestVarEx ve = new TestVarEx();
}

public class AccsSpcfr {
    public VarEx as = new VarEx();

    public static void main(String args[]) {
        AccsSpcfr accsSpcfr = new AccsSpcfr();
        
        // Accessing the private variable using the getter method
        System.out.println(accsSpcfr.as.ve.getVar());
    }
}
/*
O/P:
90
*/
