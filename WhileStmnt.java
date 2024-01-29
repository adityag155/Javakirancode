
package adiiapplication;

import java.util.Scanner;

public class WhileStmnt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Forward order");
        int i = 1;
        while (i <= n) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("Reverse Order");
        i = n;
        while (i >= 1) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i--;
        }

    }
}

/*
O/P:
Enter a number: 20
Forward order
5
10
15
20
Reverse Order
20
15
10
5
*/