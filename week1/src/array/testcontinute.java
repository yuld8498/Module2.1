package array;

import java.util.Arrays;
import java.util.Scanner;

public class testcontinute {
    public static void main(String[] args) {
        int arr[] = {1,5, 3,3,6,9,3,8,7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number delete: ");
        int input = scanner.nextInt();
        int j=0;
        int count=0;
        for (int i:arr)
            if (i==input) {
                count++;
                continue;
            } else {
                arr[j]=i;
                j++;
            }
        for (int i=0;i< arr.length-count;i++)
            System.out.print(arr[i]+" ");
    }
}
