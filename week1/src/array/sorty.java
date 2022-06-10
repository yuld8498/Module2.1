package array;

import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class sorty {
    public static void main(String[] args) {
        Integer arr2[] = {-58,58,-6,-1,5,968,74,-2,1,95};
        int arr[] = {9,5,6,874,1,32,-2,-8,53};
        String arr1[] = {"a","b","A"};
        //find value in array
        int a = Arrays.binarySearch(arr,1);
        //sort min to max
        int x = Array.getInt(arr,2);
        System.out.println(x);
        Arrays.sort(arr);
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }
}
