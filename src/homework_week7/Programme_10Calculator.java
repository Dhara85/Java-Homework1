package homework_week7;
/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class Programme_10Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = obj.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = obj.nextDouble();

        System.out.println("Enter the operation(+, - , *,/): ");
        char operation = obj.next().charAt(0);

        double result;

        switch(operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
            case '/':
                if(num2 != 0){
                    result = num1/num2;
                    System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed");
        }
        break;
        default:
        System.out.println("Invalid operation symbol");
        }
    }
}
