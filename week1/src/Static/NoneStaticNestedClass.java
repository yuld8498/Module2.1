package Static;

public class NoneStaticNestedClass {
    private int myPhoneNumber = 962435396;

    //Class nằm trong 1 phương thức của 1 class gọi là InnerClass.
    void display() {
        class Display {
            void showPhoneNumber() {
                System.out.println(myPhoneNumber);
            }
        }
        // Innerclass có thể truy xuất đến các thành phần của lớp bên ngoài
       // Display show = new Display();
      //  show.showPhoneNumber();
    }
    //inner class với biến local
    void display1(){
        final String message = "Hello, i'm Yuld"; //this local variable
        class Local{
            void msg(){
                System.out.println(message);
            }
        }
        Local local =new Local();
        local.msg();
    }

//Local class
    public String Message(String name){
        class SayHello {
            String getMessage() {
                return "Hello";
            }
            void showName(){
                System.out.println(name);
            }
        }
        SayHello sayHello = new SayHello();
        return sayHello.getMessage() + " " +"My name is: " +  name ;
    }
    //static nested class
    static class StaticNestedClass{
        static int age =26;
        static class Info{
            static void ShowAge(){
                System.out.println(" Age is : " + age);
            }
            void ShowmyName(){
                String myName = "Thanh";
                System.out.println("my name is: " + myName);
            }
        }
    }
    //Anonymous class
    void showInteres(){}
    class AnonymousClass{
    }
    public static void main(String[] args) {
        // Gọi static nested class
        StaticNestedClass.Info.ShowAge();
        //Gọi innerClass
        NoneStaticNestedClass display = new NoneStaticNestedClass();
        display.display();
        //InnerClass với biến local
        display.display1();
        //Local class
        System.out.println(new NoneStaticNestedClass().Message("Thanh"));
        // gọi anonymous class
        NoneStaticNestedClass anonymousClass = new NoneStaticNestedClass(){
            void showInteres(){
                System.out.println("play Soccer");
            }
        };
        anonymousClass.showInteres();

    }
}
