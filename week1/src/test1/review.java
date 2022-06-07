package test1;public class review {
    public static void main(String[] args) {
        int arr[] = {5,-5,-9,-75,-3,-1,51,8,6,93,-15,4,2,6,9};
        int max = (int) Math.pow(-2, 31);
        for (int i =0;i< arr.length;i++){
            if (arr[i]<0){
                if(arr[i]%2 !=0){
                    if (arr[i]>max){
                        max = arr[i];
                    }
                }
            }
        }
        if (max == (int) Math.pow(-2, 31)){
            System.out.println("fail");
        }else{
            System.out.println(max);
        }
        System.out.println(sum(10,20));
    }
    public static int sum(int x, int y){
        int result =0;
        for (int i = x ;i<y;i++){
            result+=i;
        } return result;
    }

}
