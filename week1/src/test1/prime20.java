package test1;

import java.util.Scanner;

public class prime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number");
        int howmuch = scanner.nextInt();
        int count =0;
        int j =2;
        System.out.print(howmuch+" so nguyen to dau tien: ");
        while (count <howmuch){
            int dem =0;
            for(int i =1;i<j;i++){
                if(j%i==0){
                    dem++;
                }
            }
            if (dem == 1){
                count++;
                System.out.print(j + " ");
            }
            j++;
        }
    }
}
