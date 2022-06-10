package array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ReadNumberV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        int input =scanner.nextInt();
        if (input<10){
            lessthan10(input);
        }if (input<20){
            lessthan20(input);
        }if (input<100){
            lessthan100(input);
        }else {
            greatthan99(input);
        }
    }

    public static String lessthan10( int number) {
        String array1[] = {"zero","one","two","three","four","five","six","seven","eight","night"};
        int array[] = {0,1,2,3,4,5,6,7,8,9};
        String notif="";
        for (int x : array){
            if (x == number){
                 notif = array1[x];
            }
        }
        System.out.println(notif);
        return  notif;
    }
    public static String lessthan20(int number){
        String array1[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        Integer array[] = {10,11,12,13,14,15,16,17,18,19};
        String notif="";
        for (int x : array){
            if (x == number) {
                notif = array1[Arrays.asList(array).indexOf(number)];
            }
        }
        System.out.println(notif);
        return notif;
    }
    public static void lessthan100(Integer number){
        Integer array[] = {2,3,4,5,6,7,8,9};
        String array1[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","nighty"};
        String notif="";
        char character = Integer.toString(number).charAt(0);
        int index = Character.getNumericValue(character);
        notif = array1[Arrays.asList(array).indexOf(index)];
        character = Integer.toString(number).charAt(1);

        if (Character.getNumericValue(character) == 0){
            System.out.print(notif );
        }else{
            System.out.print(notif + "-");
            lessthan10(Character.getNumericValue(character));
        }

    }
    public static void greatthan99(int number){
            String text[] = {"one","two","three","four","five","six","seven","eight","nine"};
        String array1[]={"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","nighty"};
        char character1 = Integer.toString(number).charAt(0);
        char character2 = Integer.toString(number).charAt(1);
        char character3 = Integer.toString(number).charAt(2);
        if (Character.getNumericValue(character2)==0&&Character.getNumericValue(character3)!=0){
            System.out.print(text[Character.getNumericValue(character1)-1]+ " hundred ");
            lessthan10(Character.getNumericValue(character3));
        }
        if (Character.getNumericValue(character3)==0&&Character.getNumericValue(character2)!=0){
            System.out.print(text[Character.getNumericValue(character1)-1]+ " hundred ");
            System.out.println(array1[Character.getNumericValue(character2)-1]);
        }
        if (Character.getNumericValue(character3)==0&&Character.getNumericValue(character2)==0){
            System.out.println(text[Character.getNumericValue(character1)-1]+ " hundred ");
        }
    }
}
