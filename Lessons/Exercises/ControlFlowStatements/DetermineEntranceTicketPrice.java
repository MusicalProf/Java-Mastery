package Exercises.ControlFlowStatements;

import java.util.Scanner;

public class DetermineEntranceTicketPrice {
    public static void main(String[] args) {
//        Based on the age of a visitor, determine the price of an entrance ticket to an amusement park.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        double ticketPrice;

        if(age > 0 && age < 5){
            ticketPrice = 0.0;
        } else if(age >=5 && age < 12){
            ticketPrice = 5.00;
        } else if (age >= 12 && age < 18) {
            ticketPrice = 10.00;
        }else {
            ticketPrice = 15.00;
        }
        System.out.printf("Because you are %d years old, your ticket price is, $%.2f.", age, ticketPrice);
    }
}
