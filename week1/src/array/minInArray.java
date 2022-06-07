package array;

import java.util.Scanner;

public class minInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = scanner.nextInt();
        int arr[] = new int [size];
        for (int i =0;i<arr.length;i++){
            System.out.println("Enter value by index" + i +": ");
             arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int j=1;j<arr.length;j++){
            System.out.print(arr[j] + " ");
            if (arr[j] < min){
                min =arr[j];
            }
        }
        System.out.println("\n");
        System.out.printf("%s %d", "gia tri nho nhat cua mang la: ", min);
    }
}
