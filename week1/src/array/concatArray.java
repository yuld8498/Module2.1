package array;

import java.util.Scanner;

public class concatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter length array2: ");
        int number2 = scanner.nextInt();
        double arr1[] = new double[number1];
        double arr2[] = new double[number2];
        double arr3[] = new double[number1+number2];
        for (int i=0;i<arr1.length;i++){
            arr1[i] = Math.random()*100;
            System.out.printf("%.2f %s",arr1[i]," ");
        }
        System.out.println("\n");
        for (int j=0;j<arr2.length;j++){
            arr2[j] = Math.random()*100;
            System.out.printf("%.2f %s",arr2[j]," ");
        }
        System.out.println("\n");
        for (int k = 0;k<arr3.length;k++){
            if (k<arr1.length){
                arr3[k] = arr1[k];
            }else {
                arr3[k] = arr2[k-arr1.length];
            }
            System.out.printf("%.2f %s", arr3[k], " ");
        }

    }
}
