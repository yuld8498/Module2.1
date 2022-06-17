package Static;

class StaticNestedClass {
    static String Schoole = "CodeGym";

    static class StudentInfo{
        String name;
        int age;
        String classK;
        static void getSchoole(){
            System.out.println(Schoole);
        }

        public void setAge(int age) {
            if (age<10){
                System.out.println("tuoi khong hop le");
                return;
            }this.age=age;
        }

        private void showStudentInfo(String name , int age , String classK){
            this.name=name;
            setAge(age);
            this.classK=classK;
            System.out.println(name);
            System.out.println(age);
            System.out.println(classK);
            getSchoole();
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.StudentInfo demo = new StaticNestedClass.StudentInfo();
        demo.showStudentInfo("Phap", 24,"CodeGym");
        StudentInfo info = new StudentInfo();
        info.showStudentInfo("Thanh",25,"CodeGym");
    }
}