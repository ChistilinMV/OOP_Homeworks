package Task04;

class Person implements Human {
    private String name;
    private Pet pet;

    public Person(String name) {
        this.name = name;
        this.breathe();
        this.eat();
        this.pet = null;
    }
    @Override
    public void talk() {
        System.out.println("    Person " + this.name + " talking");
    }
    @Override
    public void walk() {
        System.out.println("    Person " + this.name + " walking");
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
