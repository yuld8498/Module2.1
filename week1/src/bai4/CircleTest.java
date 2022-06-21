package bai4;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        Circle circle1 = new Circle(6);
        System.out.println(circle1.getArea());
        circle1.resize(Math.random()*100);
    }
}
