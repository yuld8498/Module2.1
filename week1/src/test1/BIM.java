package test1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BIM {
    public static void main(String[] args) {
        System.out.println("Check you BIM");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input you Weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Input you height(met)");
        double height = scanner.nextDouble();
        double h = Math.pow(height, 2);
        double bim = weight / h;
        System.out.format("%.3f\n", bim);
        //boolean a = true;
        if (bim < 18.5) {
            System.out.println("UnderWeight");
        } else {
            if (bim < 25) {
                System.out.println("Normal");
            } else {
                if (bim < 30) {
                    System.out.println("OverWeight");
                } else {
                    System.out.println("Obese");
                }
            }
        }
    }
}
