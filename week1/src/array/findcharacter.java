package array;

import java.util.Scanner;

public class findcharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" String want find char: ");
        String srt = scanner.nextLine();
        System.out.println("Enter character find in String: ");
        String character = scanner.nextLine();
        int count = 0;
        for (int i = 0; i< srt.length();i++){
            if (srt.toLowerCase().charAt(i) == character.toLowerCase().charAt(0) ){
                count+=1;
            }
        }
        System.out.println("So luong ki tu "+character+ " co trong chuoi " + srt + " la: " + count);
    }
}
