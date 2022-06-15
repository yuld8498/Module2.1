package OOP;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width=width;
        this.height = height;
    }

    public double getArea(){
        return this.width + this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return  ("Area is: " + getArea() +"\n" + "Perimeter is: " + getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(30,40);
        System.out.println(rectangle.display());
    }
}
