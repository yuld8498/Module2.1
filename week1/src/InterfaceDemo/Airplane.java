package InterfaceDemo;

public class Airplane extends Machine implements Flyable, Runable{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " Flying with an engine.");
    }

    @Override
    public void run() {
        System.out.println(getName()+ " Run on one front wheel and two rear wheels");
    }

    @Override
    public String toString() {
        System.out.println("AirPlane Model is: " + getName());
        run();
        fly();
        return super.toString();
    }
}
