package Task04;

public interface Human {
    default void breathe(){
        System.out.println("Man start breathing");
    }
    default void eat(){
        System.out.println("Man start eating");
    }
    void talk();
    void walk();
}
