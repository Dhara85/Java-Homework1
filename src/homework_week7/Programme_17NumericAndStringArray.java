package homework_week7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17NumericAndStringArray {
    public static void main(String[] args) {
        int[] numericArray = {2, 4, 6, 8, 9, 12, 15};
        String[] stringArray = {"Red", "Yellow", "Black", "Pink"};


        Arrays.sort(numericArray);
        Arrays.sort(stringArray);

        System.out.println("Sorted Numeric: " + Arrays.toString(numericArray));
        System.out.println("Sorted Array: " + Arrays.toString(stringArray));
    }

}
