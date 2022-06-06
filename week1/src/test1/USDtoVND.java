package test1;

import java.util.Scanner;

public class USDtoVND {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you have USD: ");
        double USD = scanner.nextDouble();
        double VND = USD*rate;
        System.out.println("This VND you have: " + VND);
    }
}
