package AbtrackClass.Animal;

public abstract class Fruit implements DemoAnimal.Edible {
    public class Orange extends Fruit{
        @Override
        public String howToEat() {
            return "Orange could be juiced";
        }
    }
    public class Apple extends Fruit{
        @Override
        public String howToEat() {
            return "Apple could be slided";
        }
    }
}
