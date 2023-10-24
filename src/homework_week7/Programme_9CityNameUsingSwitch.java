package homework_week7;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry Switch Statement
 */

import java.util.Scanner;

public class Programme_9CityNameUsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter an alphabet A to F: ");
        char alphabet = scanner.next().toUpperCase().charAt(0);

        String cityName = null;

        switch (alphabet) {
            case 'A':
                cityName = "America";
                break;
            case 'B':
                cityName = "Boston";
                break;
            case 'C':
                cityName = "Chicago";
                break;
            case 'D':
                cityName = "Dublin";
                break;
            case 'E':
                cityName = "Edingburgh";
                break;
            case 'F':
                cityName = "Frankfurt";
                break;
            default:
        }
        System.out.println("City Name: " + cityName);
        scanner.close();
    }
}
