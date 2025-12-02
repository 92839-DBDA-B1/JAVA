// program2.java

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter beginning balance: ");
        int beginningBalance = sc.nextInt();

        System.out.print("Enter total items charged this month: ");
        int charges = sc.nextInt();

        System.out.print("Enter total credits applied this month: ");
        int credits = sc.nextInt();

        System.out.print("Enter allowed credit limit: ");
        int creditLimit = sc.nextInt();

        // Calculate new balance
        int newBalance = beginningBalance + charges - credits;

        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("New Balance: " + newBalance);

        // Check credit limit
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Within credit limit");
        }

        sc.close();
    }
}
