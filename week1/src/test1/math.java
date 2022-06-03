package test1;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        System.out.println("Linear EquationResolver");
        System.out.println("Given a equation as 'a*x + b = c, please enter Constains: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        if (a==0 && b == c){
            System.out.println("Phuong trinh vo so nghiem");
        }else {
            System.out.println("Phuong trinh vo nghiem");
        }
        if (a!=0){
            double x =(c - b)/a;
            System.out.println("Phuong trinh co nghiem la: " + x);
        }
    }
}
