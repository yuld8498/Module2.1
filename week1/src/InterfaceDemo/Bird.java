package InterfaceDemo;

public class Bird extends Animal implements Flyable{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly");
    }

    @Override
    public String toString() {
        System.out.println( getName() + " is a Bird.");
        fly();
        return super.toString();
    }
}
