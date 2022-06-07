package array;

public class findmax {
    public static void main(String[] args) {
        double[] number = new double[15];
        for (int i=0;i<number.length;i++){
            number[i] = Math.random()*100;
        }
        double max = Math.pow(-2,31);
        for(int i=0;i<number.length;i++){
            if (max<number[i]){
                max = number[i];
            }
        }
        System.out.printf("%.3f %s", max , "la so lon nhat trong chuoi");
    }
}
