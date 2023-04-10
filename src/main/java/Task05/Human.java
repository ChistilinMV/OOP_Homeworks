package Task05;

public interface Human {
    char godgen = '0';
    default void breathe(){
        System.out.println("Man start breathing");
    }
    default void eat(){
        System.out.println("Man start eating");
    }
    void coition(Human partner);

}
