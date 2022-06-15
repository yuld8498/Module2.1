package Sort;

import java.util.Arrays;

public class merge {
    /* mảng cha là array[]
     *  mảng con 1 là array[l->m] - (l-m là length)
     * mảng con 2 là array[m+1-r](m+1 - r là length)
     * array.length = (m-l+1)+(r-m)*/
    public static void merge_sort(int array[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        //tạo 2 mảng tạm thời với độ dài n1,n2
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        //truyền giá trị từ array[] vào arr1[] và arr2[];
        for (int i = 0; i < n1; i++) {
            arr1[i] = array[l + i];
        }
        for (int j = 0; j < n2; j++) {
            arr2[j] = array[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        //so sánh và đổi chỗ
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                array[k] = arr1[i];
                i++;
            } else {
                array[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = arr2[j];
            j++;
            k++;
        }
    }

    void sort(int array[], int l, int r) {
        if (l < r) {
            //midside
            int m = (l + r) / 2;
            //hàm đệ quy
            sort(array, l, m);
            sort(array, m + 1, r);
            merge_sort(array,l,m,r);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 9, 6, 3, 4, 7, 8, 6, 1};
        merge ob = new merge();
        ob.sort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
