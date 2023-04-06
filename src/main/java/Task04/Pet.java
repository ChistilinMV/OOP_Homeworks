package Task04;

public class Pet implements Animal {
    private String name;

    public Pet(String name) {
        this.name = name;
        this.crap();
        this.scream();
    }

    @Override
    public void scream() {
        System.out.println("Sometimes " + this.name + " simple scream");
    }

    public void respond() {
        System.out.println("    " + name + " responds!");
    }
}
