package Sort;

import java.util.Arrays;

public class Quick {
    //low =0, high = arr.length-1;
    public static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
        int temp = array[i + 1];
        array[i+1]= array[high];
        array[high] = temp;
        return i+1;
    }
    public static void sort(int array[],int low,int high){
        if (low < high){
            int pi = partition(array,low,high);
            System.out.println(pi);
           sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int array [] = {7,8,5,1,2,3,6};
        partition(array,0,6);
        System.out.println(Arrays.toString(array));
        Quick quick = new Quick();
        quick.sort(array,0,array.length-1);
    }
}
