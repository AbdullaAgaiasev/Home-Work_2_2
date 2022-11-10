public class Mersedes extends  Transport{
    private int model;
    private String vid;

    public Mersedes(String name, int model, String vid) {
        super(name);
        this.model = model;
        this.vid = vid;
    }
    @Override
    public void print() {
        System.out.println("Mersedes " + "\nName Driver: " + getName() +"\nModel: " + model + "\nVid: " + vid);

    }


}
