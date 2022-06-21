package AbtrackClass.Animal;

public abstract class AnimalObj {
    private String name;
    private int age;
    private String gender;
    public abstract void inLive();
    public abstract void move();
    public abstract void eat();
    AnimalObj animalObj = new AnimalObj() {
        @Override
        public void inLive() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    };
}
