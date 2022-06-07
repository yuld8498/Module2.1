package array;

public class minValue {
    public static void main(String[] args) {
            int [] arr = {15,48,96,5,8,7,2,4,32,1,65};
            int index = minValue(arr);
        System.out.println("min value is : " + index);
    }
    public static int minValue(int[] array){
        int index =Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){
            if (array[i]<index){
                index = array[i];
            }
        }
        return index;
    }
}
