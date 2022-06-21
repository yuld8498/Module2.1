package bai3;

import circle.Circle;
import circle.ComparableCircle;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new ComparableCircle(56,"red",true);
        circles[1] = new ComparableCircle(8.2, "while", false);
        circles[2] = new ComparableCircle(6.2);
        System.out.println("Pre- Sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After - Sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
