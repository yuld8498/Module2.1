package Static;

public class NesstedClass {
    String say;
    static class Nessted{
        String paragraph;
        private Nessted(String paragraph){
            this.paragraph=paragraph;
            System.out.println("Hello");
        }
    }


    public static void main(String[] args) {
        NesstedClass.Nessted nessted = new NesstedClass.Nessted("hallo");
        System.out.println(nessted.paragraph);
    }
}
