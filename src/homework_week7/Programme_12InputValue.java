package homework_week7;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Programme_12InputValue {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter character : ");
        char input = obj.next().charAt(0);

        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println("The input is an alphabet ");
        } else if (input >= '0' && input <= '9') {
            System.out.println("The input is a number: ");
        } else {
            System.out.println(" The input is a symbol: ");
        }
        obj.close();
    }
}
