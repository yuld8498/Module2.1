package test1;

import java.util.Scanner;

public class sayhello {
    public static void main(String[] args) {
        System.out.println("Enter you name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
