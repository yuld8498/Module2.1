package test1;

import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args) {
        System.out.println("Check day of month");
        Scanner scanner = new Scanner(System.in);
        System.out.println("input month to check: ");
        int a = scanner.nextInt();
        if (a==2){
            System.out.println("thang" + a + "co 29 hoac 28 ngay");
        }else {
            if(a==4||a==6||a==9||a==11){
                System.out.println("thang " + a+ "co 30 ngay");
            }else{
                System.out.println("thang " + a +"co 31 ngay");
            }
        }
    }
}
