package homework_week7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner;

public class Programme_16PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner a2 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number =  a2.nextInt();

        if(number > 0) {
            System.out.println("The number is Positive ");
        } else if(number < 0){
            System.out.println("The number is Negative ");
        } else {
            System.out.println("The number is Zero: ");
        }
        a2.close();
    }
}
