package AbtrackClass.Animal;

import array.Demo;

public abstract class DemoAnimal {
    public abstract String makeSound();
    interface Edible{
        public String howToEat();
    }
    public class Chicken extends  DemoAnimal implements Edible{

        @Override
        public String makeSound() {
            return "cluck cluck";
        }

        @Override
        public String howToEat() {
            return "could be fried";
        }
    }
    public class Tiger extends DemoAnimal{
        @Override
        public String makeSound(){
            return "roar - roar";
        }
    }
}
