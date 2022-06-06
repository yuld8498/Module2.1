package test1;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.println("Leap Year");
        System.out.println("Check if the year is a leap year");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Year you want check: ");
        int year = scanner.nextInt();
        if (year%4 == 0 && year % 100 !=0) {
            System.out.println(year + "la nam nhuan");
        }else {
            if (year % 100 ==0 && year % 400 == 0) {
                System.out.println(year + "la nam nhuan");
            }else {
                System.out.println(year + "khong phai la nam nhuan");
            }
        }
    }
}
