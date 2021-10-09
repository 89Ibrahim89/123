package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount(0);
        bankAccount.deposit(20000);
        System.out.println(bankAccount.getAmount());

        while (true) {
            try {
                bankAccount.withdraw(6000);
                System.out.println("You withdrew: 6000");
                System.out.println("You balance: " + bankAccount.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("You may withdraw only: " + bankAccount.getAmount());
                break;
                }


            }

        }
}
