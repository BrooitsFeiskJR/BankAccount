package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
        double value;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();

        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char initialDepositAnswer = sc.nextLine().charAt(0);

        if(initialDepositAnswer == 'y') {
            System.out.print("Enter initial deposit value: ");
            value  = sc.nextDouble();
            account = new Account(accountNumber, name, value);
        } else {
            account = new Account(accountNumber, name);

        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        value = sc.nextDouble();
        System.out.println("Update account data:");
        account.makeDeposit(value);
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.makeWithdraw(value);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
