package Task04;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John");
        Pet cat = new Pet("Kitty");
        john.setPet(cat);
        john.talk();
        john.callPet(); // выводит "Kitty responds!"
        john.walk();
    }
}
