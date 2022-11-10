public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("\nName Dog: " + getNameDog() + "\n\uD83D\uDC36");

    }
}
