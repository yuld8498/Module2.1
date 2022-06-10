package test1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class readNumber {
    public static String twocase(String str1) {
        String lessthanten[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "night"};
        int startzero[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String lessthantwelve[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        Integer starten[] = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int check1 = 0;
        int second1 = 0;
        String str;
        if (Integer.parseInt(str1) <= 20) {
            check1 = Arrays.asList(starten).indexOf(Integer.parseInt(str1));
            str = lessthantwelve[check1];
            System.out.println(str);
        } else {
            {
                switch (Character.getNumericValue(str1.charAt(0))) {
                    case 2:
                        second1 = Character.getNumericValue((str1.charAt(1)));
                        if (second1 == 0) {
                            str = "twenty";
                            System.out.println(str);
                        } else {
                            str = "twenty";
                            System.out.println(str + "-" + lessthanten[second1]);
                        }
                        break;
                    case 3:
                        second1 = Character.getNumericValue((str1.charAt(1)));
                        if (second1 == 0) {
                            str = "thirty";
                            System.out.println(str);
                        } else {
                            str = "thirty";
                            System.out.println(str + "-" + lessthanten[second1]);
                        }
                        break;
                    case 5:
                        second1 = Character.getNumericValue((str1.charAt(1)));
                        if (second1 == 0) {
                            str = "fifty";
                            System.out.println(str);
                        } else {
                            str = "fifty";
                            System.out.println(str + "-" + lessthanten[second1]);
                        }
                        break;
                    case 8:
                        second1 = Character.getNumericValue((str1.charAt(1)));
                        if (second1 == 0) {
                            str = "eighty";
                            System.out.println(str);
                        } else {
                            str = "eighty";
                            System.out.println(str + "-" + lessthanten[second1]);
                        }
                        break;
                    case 9:
                        second1 = Character.getNumericValue((str1.charAt(1)));
                        if (second1 == 0) {
                            str = "nighty";
                            System.out.println(str);
                        } else {
                            str = "nighty";
                            System.out.println(str + "-" + lessthanten[second1]);
                        }
                        break;
                    default: {
                        int secondd1 = Character.getNumericValue((str1.charAt(1)));
                        second1 = Character.getNumericValue((str1.charAt(0)));
                        if (secondd1 == 0) {
                            str = lessthanten[second1] + "ty";
                            System.out.println(str);
                        } else {
                            str = lessthanten[second1] + "ty-" + lessthanten[secondd1];
                            System.out.println(str);
                        }
                    }
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String lessthan10[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "night"};
        int start0[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String lessthan20[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        Integer star10[] = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number want read: ");
        String input = scanner.nextLine();
        int check = 0;
        int second = 0;
        switch (input.length()) {
            case 1:
                check = Integer.parseInt(input);
                System.out.println(lessthan10[check]);
                break;
            case 2:
                twocase(input);
                break;
            case 3:
                String last;
                String first;
                int x = Character.getNumericValue(input.charAt(1));
                if (x == 0) {
                    first = lessthan10[Character.getNumericValue((input.charAt(0)))];
                    first += " hundred";
                    int y = Character.getNumericValue(input.charAt(2));
                    System.out.println(first+" ");

                } else {
                    first = lessthan10[Character.getNumericValue((input.charAt(0)))];
                    first += " hundred";
                    last = Integer.toString(Character.getNumericValue((input.charAt(1))));
                    last += Integer.toString(Character.getNumericValue((input.charAt(2))));
                    System.out.print(first + " ");
                    twocase(last);
                }
                break;
            case 4:
                String thousand;
                thousand = lessthan10[Character.getNumericValue(input.charAt(0))] + " thousand ";
                String hundred = lessthan10[Character.getNumericValue((input.charAt(1)))] + " hundred ";
                thousand += hundred;
                String ty = Integer.toString(Character.getNumericValue((input.charAt(2))));
                ty += Integer.toString(Character.getNumericValue((input.charAt(3))));
                System.out.print(thousand + " ");
                twocase(ty);
        }
    }
}
