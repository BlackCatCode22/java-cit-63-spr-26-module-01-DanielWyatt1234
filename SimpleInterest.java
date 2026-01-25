// SimpleInterest.java
// 1/25/26

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("--- Simple Interest Calculator ---");

    System.out.print("Enter Principal amount ($): ");
    double principal = sc.nextDouble();

    System.out.print("Enter Annual Interest Rate (as a %): ");
    double ratePercent = sc.nextDouble();
    double rateDecimal = ratePercent / 100;

    System.out.print("Enter the Time (in years): ");
    double time = sc.nextDouble();

    double interest = principal * rateDecimal * time;
    double totalAmount = principal + interest;

    System.out.println("\n--- Results ---");
    System.out.printf("Principal: $%.2f%n", principal);
    System.out.printf("Interest Rate: %.2f%%%n", ratePercent);
    System.out.printf("Time: %.1f years%n", time);
    System.out.println("-------------------------");
    System.out.printf("Total Interest Earned: $%.2f%n", interest);
    System.out.printf("Final Balance: $%.2f%n", totalAmount);
    }
}