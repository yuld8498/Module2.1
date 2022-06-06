package test1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number want check: ");
        int number = scanner.nextInt();
        int count = 0;
        int i = 1;
        if (number <2) {
            System.out.println(number + "khong phai la so nguyen to");
        } else {
            while (i < number) {
                if (number % i == 0) {
                    count += 1;
                }
                i++;
            }
            if (count == 1) {
                System.out.println(number + " la so nguyen to");
            } else {
                System.out.println(number + "khong phai la so nguyen to");
            }
            count = 0;
        }
    }
}
