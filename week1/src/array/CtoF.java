package array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CtoF {
    public static double cToF(double celsius){
        double fahrenheit =(9.0/5)*celsius+32;
        return fahrenheit;
    }
    public static double fToC(double fahrenheit){
        double celsius = (5.0/9)*(fahrenheit-32);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Fahrenheit to Celcius ");
        System.out.println("2.Celcius to Fahrenheit");
        System.out.println("Enter you chose.");
        int inputNumber = scanner.nextInt();
        switch (inputNumber){
            case 1:
                System.out.println("Enter Fahrenheit: ");
                double input = scanner.nextInt();
                System.out.printf("%.3f %s",fToC(input), "do C");
                break;
            case 2:
                System.out.println("Enter Celcius: ");
                double input1 = scanner.nextInt();
                System.out.printf("%.3f %s",cToF(input1), "do F");
                break;
            default:
                System.out.println("vui long chon 1 hoac 2");
        }

    }
}
