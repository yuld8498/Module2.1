package array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int arr[] = {9, 5, 4, 8, 6, 3};
        for (int j = 0; j < arr.length - 1; j++)
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i] ^ arr[i + 1];
                    arr[i + 1] = arr[i + 1] ^ arr[i];
                    arr[i] = arr[i] ^ arr[i + 1];
                }
            }
        System.out.println(Arrays.toString(arr));
    }
}
