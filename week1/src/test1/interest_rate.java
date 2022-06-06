package test1;

import java.util.Scanner;

public class interest_rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;
        int month;
        double interestrate;
        System.out.println("enter you money: ");
        money = scanner.nextDouble();
        System.out.println("enter month");
        month = scanner.nextInt();
        System.out.println("enter interest rate: ");
        interestrate = scanner.nextDouble();
        double totalInterest =0;
        for(int i = 0; i < month; i++){
             totalInterest += money * (interestrate/100)/12 * month;
        }
        System.out.println(totalInterest);

    }
}
