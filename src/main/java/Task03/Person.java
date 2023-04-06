package Task03;

class Person implements Human {
    String name;
    char gender;
    Person mother;
    Person father;

    public Person(String name, char gender, Person mother, Person father) {
        this(name, gender);
        //this.name = name;
        //this.gender = gender;
        this.mother = mother;
        this.father = father;
    }
    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
        if (gender != godgen) { this.breathe(); }
        //this.mother = null;
        //this.father = null;
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
        System.out.println(this.name + " do coitus with " + ((Person)partner).name);
    }
    @Override
    public void breathe() {
        //Human.super.breathe();
        System.out.println(this.name + " start breathing");
    }
}