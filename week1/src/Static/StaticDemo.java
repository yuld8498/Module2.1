package Static;

public class StaticDemo {
    static String name;
    int age;
    String gender;
    /*
    * * Static:
    * Phương thức của lớp.
    * sử dụng trực tiếp không cần đến đối tượng.
    * biến static là biến của lớp, set 1 lần duy nhất và sử dụng được cho tất cả đối tượng trong class.
    * phuong thức static can thiệp đến được biến static.
    * */
    //1. phương thức của lớp.
    static void changeName(){
        StaticDemo.name = "Thanh";
    }
    static String changeCoutry(String country){
        StaticDemo.country = country;
        return country;
    }
    private static String country = "Earth";
    public StaticDemo(String name, int age, String gender){
        this.name = name;
        this.age =age;
        this.gender=gender;
        System.out.println(country);
        changeCoutry("Viet Nam");
        System.out.println(country);
        // sử dụng trực tiếp không cần thông qua đối tượng
        changeName();
    }
    public StaticDemo(String name, int age){
        this.name = name;
        this.age =age;
        this.gender=gender;
        // nêu gọi contructor phía trên trước,
        // phương thức static can thiệp đến biến static là country ở đối contructor phía trên
        // nên biến static bây giờ là giá trị của phương thức static trả về là "Viet Nam".
        //nếu gọi contructor không chứa phương thức static thì biến static vẫn giữ nguyên.
        System.out.println(country);
    }
}
