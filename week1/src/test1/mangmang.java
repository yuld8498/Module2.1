package test1;

import java.util.Scanner;

public class mangmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number find GCD:");
        int number1 = scanner.nextInt();
        System.out.println("enter number2 find GCD: ");
        int number2 = scanner.nextInt();
        int arr1[] = new int[number1];
        int arr2[] = new int[number2];
        int count = 0;
        for (int i = 1; i <= arr1.length; i++) {
            if (number1 % i == 0) {
                arr1[count] = i;
                count += 1;
            }
        }
        count = 0;
        for (int j = 1; j <= arr2.length; j++) {
            if (number2 % j == 0) {
                arr2[count] = j;
                count += 1;
            }
        }
        int GCD=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if (arr1[i] == arr2[j]){
                    if (arr1[i] > GCD){
                        GCD = arr1[i];
                    }
                }
            }
        }
        System.out.println(GCD);
    }
}
