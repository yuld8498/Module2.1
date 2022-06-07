package array;

import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want delete in array : ");
        int input = scanner.nextInt();
        int[] arr = {15, 68, 15,15,15, 15, 12, 698};
        int count=0;
        do {
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length - 1) {
                    if (arr[i] == input) {
                        arr[i] = arr[i + 1];
                        arr[i + 1] = input;
                    }
                }
            }
            count++;
        }while (count < arr.length);
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
}

