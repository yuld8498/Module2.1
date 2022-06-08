package array;

public class line {
    public static void main(String[] args) {
        double [][] arr=new double[5][5];
        double result =0;
        for (int i=0; i<5;i++){
            for (int j=0;j<5;j++){
                arr[i][j] = Math.random()*100;
                System.out.printf("%.0f %s",arr[i][j], " ");
            }
            result+=arr[i][i];
            System.out.println();
        }
        System.out.printf("%s %.0f", "tong duong cheo chinh la", result);
    }
}
