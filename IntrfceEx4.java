interface Transaction
 {
    int amt = 20000;
    void withdrawAt(int amt); // Corrected the method signature
}

class Bank implements Transaction 
{
    public void withdrawAt(int amt)
 { // Corrected the method signature
        System.out.println("Amount of Withdraw: " + amt);
    }
}

public class IntrfceEx4 
{ // Renamed the class to match the filename
    public static void main(String args[])
{
        Transaction t = new Bank();
        t.withdrawAt(Transaction.amt); // Pass the amt from Transaction interface
    }
}
/*
O/P:
Amount of Withdraw: 20000
*/