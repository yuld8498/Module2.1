package Static;

public class Pet {
    final String BIG = "big";
    final String MEDIUM = "medium";
    final String SMAIL = "small";
    String name;
    String type;
    int age;
    String size;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("tuoi khong hop le.");
            return;
        }
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBIG() {
        return BIG;
    }

    public String getMEDIUM() {
        return MEDIUM;
    }

    public String getSMAIL() {
        return SMAIL;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public Pet(String name, String type, int age, String size) {
        this.name = name;
        this.type = type;
        setAge(age);
        this.size = size;
    }
}
