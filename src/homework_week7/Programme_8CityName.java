package homework_week7;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme_8CityName {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter alphabet A to F : ");
        char alphabet = obj.next().toUpperCase().charAt(0);

        String cityname;

        if (alphabet == 'A') {
            cityname = "Amsterdam";
        } else if (alphabet == 'B') {
            cityname = "Barcelona";
        } else if (alphabet == 'C') {
            cityname = "Chicago";
        } else if (alphabet == 'D') {
            cityname = "Dublin";
        } else if (alphabet == 'E') {
            cityname = "Edinburgh";
        } else if (alphabet == 'F') {
            cityname = "Finland";
        } else {
            cityname = "Invalid entry";
        }
        System.out.println("City Name: " + cityname);
        obj.close();
    }
}