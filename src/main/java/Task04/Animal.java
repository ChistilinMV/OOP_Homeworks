package Task04;

public interface Animal {
    default void crap(){
        System.out.println("Animal do a crap");
    }
    void scream();
}
