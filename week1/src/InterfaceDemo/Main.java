package InterfaceDemo;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setName("Bob");
        dog.toString();
        Animal bird = new Bird();
        bird.setName("Canh cut");
        bird.toString();
        Animal fish = new Fish();
        fish.setName("Yellow Fish");
        fish.toString();
        Machine car = new Cars();
        car.setName("Dino");
        car.toString();
        Machine airplane = new Airplane();
        airplane.setName("Boing - 747");
        airplane.toString();
    }
}
