package Task01;

public class Person {
    String name;
    char gender;
    Person mother;
    Person father;

    public Person(String name, char gender, Person mother, Person father) {
        this.name = name;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
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
}