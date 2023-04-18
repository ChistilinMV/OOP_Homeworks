package Task08;

class Person implements Human {
    private String name;
    private char gender;
    private Person mother;
    private Person father;

    public Person(String name, char gender, Person mother, Person father) {
        this(name, gender);
        this.mother = mother;
        this.father = father;
    }

    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
        if (gender != GODGEN) {
            this.breathe();
        }
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void coition(Human partner) {
        System.out.println(this.name + " do coitus with " + ((Person) partner).name);
    }

    @Override
    public void breathe() {
        System.out.println(this.name + " start breathing");
    }
}