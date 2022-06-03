package test1;

import java.util.Date;
import java.util.Scanner;

public class Planets {
    public static void main(String[] daytime){
        Date now = new Date();
        System.out.println("Now: "+now);
        int i = 10;
        float f =20.5f;
        double d= 20.5;
        boolean b = true;
        char c ='c';
        String s ="Hà Nội";
        System.out.println(i + "\n" + f + "\n" + d + "\n" + b + "\n" + c + "\n" + s );
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        width = scanner.nextFloat();
        System.out.println("Enter Height");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Area is : " + area);
    }
}
