package homework_week7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6OddEven {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = t.nextInt();
        if(number % 2 == 0) {
            System.out.println( number + " is Even ");
        }else{
            System.out.println( number + " is Odd ");
        }
        t.close();

    }

}
