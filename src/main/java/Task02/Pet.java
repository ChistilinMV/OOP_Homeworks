package Task02;

public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public void respond() {
        System.out.println(name + " responds!");
    }
}
