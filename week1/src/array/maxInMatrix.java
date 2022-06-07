package array;

public class maxInMatrix {
    public static void main(String[] args) {
        double max = Double.MIN_VALUE;
        double arr[][] = new double[5][5];
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.printf("%.3f %s",arr[i][j] = Math.random()*100 , " ");
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println("\n");
        }
        System.out.printf("%.3f",max);
    }
}
