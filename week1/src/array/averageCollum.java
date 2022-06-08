package array;

import java.util.Scanner;

public class averageCollum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double arr[][] = new double[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%.3f %s", arr[i][j] = Math.random() * 100, " ");
            }
            System.out.println("\n");
        }
        double result =0;
        System.out.println("Enter collum you chose: ");
        int c = scanner.nextInt();
        for (int k=0;k<5;k++){
            double index = arr[k][c];
            result+=index;
        }
        System.out.printf("%s %d %s %.3f", "Tong gia tri cua cot", c, "la: ", result);
    }
}
