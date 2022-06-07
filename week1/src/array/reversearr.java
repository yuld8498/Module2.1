package array;

public class reversearr {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 2, 6, 3, 8, 4, 8, 9, 2, 325, 3, 6};
        for (int i=0;i<arr.length/2;i++){
            arr[i]=arr[i]^arr[arr.length-1-i];
            arr[arr.length-1-i]= arr[arr.length-1-i]^arr[i];
            arr[i]=arr[i]^arr[arr.length-1-i];
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

//        int reversearray[] = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            reversearray[i] = arr[arr.length - i - 1];
//            System.out.print(reversearray[i] + " ");
//        }
    }
}
