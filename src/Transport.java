public abstract class Transport implements Printable{
    private String name;


    public Transport(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void createObject() {
        System.out.println();
    }
}
