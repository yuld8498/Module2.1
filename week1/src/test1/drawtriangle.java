package test1;

import java.util.Scanner;

public class drawtriangle {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1: Draw the square triangle - top left");
        System.out.println("2:  Draw the square triangle - top right");
        System.out.println("3:  Draw the square triangle - bottom left");
        System.out.println("4:  Draw the square triangle - bottom right");
        System.out.println("Enter you chose: ");
        Scanner scanner = new Scanner(System.in);
        int chose = scanner.nextInt();
        switch (chose){
            case  1:
                for (int i=5;i>0;i--){
                    for (int j=0;j<i;j++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case  2:
                for(int i=5;i>0;i--){
                    for (int j = 5-i;j>0;j--){
                        System.out.print("    ");
                    }
                    for(int k=0; k < i;k++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case  3:
                for (int i=0;i<=5;i++){
                    for (int j=0;j<i;j++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case  4:
                for(int i=0;i<5;i++){
                    for (int j = 5-i;j>0;j--){
                        System.out.print("    ");
                    }
                    for(int k=0; k <= i;k++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
        }
    }
}
