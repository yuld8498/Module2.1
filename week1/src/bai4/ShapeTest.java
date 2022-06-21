package bai4;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
        Shape[] shapes = new Shape[4];
        Circle circle = new Circle(5,"red",true);
        shapes[0] = circle;
        Circle circle1 = new Circle();
        shapes[1] = circle1;
        Rectangle rectangle =new Rectangle(6,7,"white",false);
        shapes[2] = rectangle;
        Rectangle rectangle1 =new Rectangle(7,8);
        shapes[3] = rectangle1;
        for (Shape shapee : shapes){
            System.out.println(shapee);
        }
        System.out.println("shape before resize: ");
        double size = Math.random()*100;
        circle.resize(size);
        System.out.println("\t");
        circle1.resize(size);
        System.out.println("\t");
        rectangle.resize(size);
        System.out.println("\t");
        rectangle1.resize(size);
    }
}
