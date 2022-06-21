package InterfaceDemo;

public class Cars extends  Machine implements Runable{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " Run on 4 wheels");
    }

    @Override
    public String toString() {
        System.out.println(getName() + " is a Car.");
        run();
        return super.toString();
    }
}
