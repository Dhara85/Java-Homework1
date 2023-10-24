package homework_week7;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Programme_19CalculateAverage {
    public static void main(String[] args) {
    int[] numbers = {5,10,15,20,25};
    int sum = 0;
    for (int number : numbers) {
        sum +=number;
    }
    double average =(double) sum/numbers.length;
        System.out.println("Average of the array elements: " + average);
    }
}
