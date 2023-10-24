package homework_week7;

/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Programme1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = obj.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";//ternary operator
        System.out.println("Number is : "+result);
        }
    }

