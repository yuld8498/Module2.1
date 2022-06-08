package array;

import java.util.Scanner;

public class yesOrNo {
    public static void main(String[] args) {
        int size;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter amount students: ");
            size = scanner.nextInt();
        } while (size > 30);
        double arr[] = new double[size];
        for (int i = 0; i < arr.length; i++) {
            do {
                System.out.println("Enter score of students: " + i);
                arr[i] = scanner.nextDouble();
            } while (arr[i] <= 0 || arr[i] >= 10);
        }
        System.out.println("Danh sach sinh vien dat : ");
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] >= 5 && arr[k] <= 10) {
                System.out.println("Sinh vien " + k);
                count += 1;
            }
        }
        System.out.println("So sinh vien dat la : " + count);
    }
}
