package Task05;

public interface Human {
    char GODGEN = '0';
    String GODNAME = "-= God Father =-";

    default void breathe() {
        System.out.println("Man start breathing");
    }

    default void eat() {
        System.out.println("Man start eating");
    }

    void coition(Human partner);

}
