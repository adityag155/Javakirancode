package adiiapplication;

import java.util.*;

public class minmax
{

    public static void main(String[] args)
    {

            Scanner sc=new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int a = sc.nextInt();

            System.out.print("Enter the second number: ");
            int b = sc.nextInt();


            int min = (a < b) ? a : b;
            int max = (a > b) ? a : b;

            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }
    }
/*
O/P:
Enter the first number: 12
Enter the second number: 32
Min = 12
Max = 32
*/