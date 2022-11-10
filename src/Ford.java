public class Ford extends  Transport{
    private String spaciousness;//вместительность


    public Ford(String name, String spaciousness) {
        super(name);
        this.spaciousness = spaciousness;
    }

    @Override
    public void print() {
        System.out.println("Ford " + "\nName Driver: " + getName() +"\nSpaciousness: " + spaciousness);

    }
}
