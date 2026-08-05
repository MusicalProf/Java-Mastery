package Exercises.ApplicationStructure.BasicBankAccount.main;

import Exercises.ApplicationStructure.BasicBankAccount.bank.BankAccount;

public class Main {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(13476892);
        account1.setAccountHolder("Ra'mar K. Leach");
        account1.setBalance(1000.00);

        System.out.println("Account Holder: " + account1.getAccountHolder());
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Balance: " + account1.getBalance());
    }
}