package adiiapplication;

import java.util.Scanner;

public class Switchstmnt {

    public static void main(String[] args) {

        int day; 
        String dayName;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: ");
        day = sc.nextInt(); // Read the user's input

        switch (day) {
            case 1:
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;

            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;

            case 7:
                dayName = "Sunday";
                break;

            default:
                dayName = "Invalid Day";
                break;
        }

        System.out.println("The day is: " + dayName);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}

/*
 * O/P:
 * Enter a day: 4
The day is: Thursday
*/
