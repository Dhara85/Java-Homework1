package homework_week7;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Programme_13FindDayName {
    public static void main(String[] args) {
        Scanner v1 = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7: ");
        int dayNumber = v1.nextInt();

        String dayName;

        switch(dayNumber) {
            case 1:
                dayName = "MONDAY";
                break;
            case 2:
                dayName = "TUESDAY";
                break;
            case 3:
                dayName = "WEDNESDAY";
                break;
            case 4:
                dayName ="THURSDAY";
                break;
            case 5:
                dayName ="FRIDAY";
                break;
            case 6:
                dayName = "SATURDAY";
                break;
            case 7:
                dayName = "SUNDAY";
                break;
            default:
                dayName ="Invalid input: Week contains 1 to 7 days";
                break;
        }
        System.out.println("Day of the week: " + dayName);
        v1.close();
    }
}
