package homework_week7;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme_20ArraySpecificValue {
    public static void main(String[] args) {
        int[] numbers = {25, 30, 35, 40, 45};
        int sum = 30;

        boolean containsValue = false;
        for (int number : numbers) {
            if (number == sum) {
                containsValue = true;
                break;
            }
        }
        if (containsValue) {
            System.out.println("The array contains the value" + sum + ".");
        } else {
            System.out.println("The array does not contain the value " + sum + ".");
        }
    }
}
