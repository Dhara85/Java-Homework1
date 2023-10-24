package homework_week7;

/**
 * Write a Java program to sum values of an array.
 */

public class Programme_18ArraySum {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5};

        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println("Sum of array : " + sum);
    }
}
