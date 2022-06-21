package InterfaceDemo;

public class Fish extends Animal implements swimable{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " can swim under water");
    }

    @Override
    public String toString() {
        System.out.println( getName() + " is a Fish.");
        swim();
        return super.toString();
    }
}
