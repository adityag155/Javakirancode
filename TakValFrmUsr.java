import java.util.Scanner;

public class TakValFrmUsr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();

        System.out.println("Addition is: " + (a + b));
    }
}

/*
O/P:
Enter 1st number:
20
Enter 2nd number:
30
Addition is: 50
*/