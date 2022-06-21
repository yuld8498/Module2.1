package InterfaceDemo;

public class Dog extends Animal implements barkable, Runable{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " run on 4 legs");
    }

    @Override
    public void bark() {
        System.out.println(getName() + " backing woof woof");
    }

    @Override
    public String toString() {
        System.out.println( getName() + "is a Dog");
        run();
        bark();
        return super.toString();
    }
}
