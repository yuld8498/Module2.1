package OOP;

public class oopStatic {
        private int ID;
        private String name;
        private String ofclass;
        private String classity;
        private static String college = "WWsK";
        static void changeCollege(){
            oopStatic.college = "KLpoA";
        }
        protected oopStatic(int ID,String name, String ofclass,String classity){
            this.ID=ID;
            this.name =name;
            this.ofclass=ofclass;
            this.classity=classity;
        }
        void display(){
            System.out.println(ID + " " + name +" " + ofclass + " " + " " + classity+" " +college);
        }
    }


