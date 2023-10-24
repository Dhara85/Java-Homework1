package homework_week7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Programme_2LeapYear {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the year: "); // user input the year
        int year = obj.nextInt(); // year is number so we use int

        boolean isleapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isleapyear) {
            System.out.println( "this is leap year");
        } else {
            System.out.println("this is not a leap year");
        obj.close();
        }
    }
}
