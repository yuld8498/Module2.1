package array;

import java.util.Scanner;

public class addValueToArrayByIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int number = scanner.nextInt();
        System.out.println("Enter number you want add: ");
        double input = scanner.nextDouble();
        System.out.println("Enter index you want add: ");
        int index = scanner.nextInt();
        double arr[] = new double[number];
        if (index < number && index>=0 ) {
            arr[index] = input;
            System.out.println(arr[index]);
        } else {
            System.out.println("vuot qua gioi han mang");
        }
        for(double x : arr){
            System.out.println(x+" ");
        }
    }
}
