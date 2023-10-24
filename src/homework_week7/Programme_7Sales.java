package homework_week7;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Programme_7Sales {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Sales ID: ");
        int salesId = obj.nextInt();

        System.out.println("Enter Seller name: ");
        String sellername = obj.next();

        System.out.println("Enter Sales Amount: $");
        double salesAmount = obj.nextDouble();

        System.out.println("Enter Basic Salary: $");
        double basicSalary = obj.nextDouble();

        double commissionRate = 0.0;
        if (salesAmount >= 50000) {
            commissionRate = 0.10;//10% commission
        } else if (salesAmount >= 30000) {
            commissionRate = 0.08;//8% commission
        } else if (salesAmount >= 20000) {
            commissionRate = 0.06;// 6% commission
        } else {
            commissionRate = 0.04;// 4%commission
        }
        double commission = salesAmount * commissionRate;
        double totalSalary = basicSalary + commission;

        System.out.println("\nSales ID: " + salesId);
        System.out.println("Seller's Name: " + sellername);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Commission: $" + commission);
        System.out.println("Total Salary: $" + totalSalary);
        obj.close();
    }
}
