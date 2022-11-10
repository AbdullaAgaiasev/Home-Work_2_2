public class Bmw extends  Transport{
    private  int volume;
    private String expensive_parts;// дорогие детали


    public Bmw(String name, int volume, String expensive_parts) {
        super(name);
        this.volume = volume;
        this.expensive_parts = expensive_parts;
    }

    @Override
    public void print() {
        System.out.println("Bmw " +"\nName Driver: " + getName() +"\nVolume: " + volume + "\nExpensive_parts: " + expensive_parts);

    }
}
