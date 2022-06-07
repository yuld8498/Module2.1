package array;

import java.util.Scanner;

public class findName {
    public static void main(String[] args) {
        String names[] = {"tuan", "phap", "trung", "anh", "my", "duc", "lan", "y", "nga"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name you find: ");
        String name = scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            boolean result = name.equalsIgnoreCase(names[i]);
            if (result == true) {
                System.out.println(name + " O vi tri so " + i + " trong danh sach ten");
            }
        }
    }
}





