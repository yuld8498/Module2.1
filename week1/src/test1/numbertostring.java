package test1;

public class numbertostring {
    public static void main(String[] args) {
        int number = 53;
        String string = String.valueOf(number);
        System.out.println(string.length());
        char ch = string.charAt(1);
        System.out.println(ch);
        int a = Character.getNumericValue(ch);
        if (a == 3){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
}
