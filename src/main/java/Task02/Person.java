package Task02;

public class Person {
    private String name;
    private Pet pet;

    public Person(String name) {
        this.name = name;
        this.pet = null;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        if (pet != null) {
            pet.respond();
        }
    }
}
