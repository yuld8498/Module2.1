package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo1 {
    public static int[] mySort(int arrayname[]) {
        int start = 0;
        int end = arrayname.length - 1;
        boolean conditon = true;
        while (conditon == true) {
            conditon = false;
            for (int i = 0; i < end; i++) {
                if (arrayname[i] < arrayname[i + 1]) {
                    arrayname[i] = arrayname[i] ^ arrayname[i + 1];
                    arrayname[i + 1] = arrayname[i + 1] ^ arrayname[i];
                    arrayname[i] = arrayname[i + 1] ^ arrayname[i];
                    conditon = true;
                }
            }
            if (conditon == false) {
                break;
            }
            for (int j = end - 1; j > start; j--) {
                if (arrayname[j] < arrayname[j + 1]) {
                    arrayname[j] = arrayname[j] ^ arrayname[j + 1];
                    arrayname[j + 1] = arrayname[j + 1] ^ arrayname[j];
                    arrayname[j] = arrayname[j + 1] ^ arrayname[j];
                    start++;

                }
            }
        }
        return arrayname;
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 5, 9, 45, 6, 35, 8, 74, 89, 0, 1, 12, 0, 59, -2, -1, -2, -2};
        mySort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
