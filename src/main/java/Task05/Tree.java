package Task05;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private List<Person> tree = new ArrayList<>();

    public List<Person> getTree() {
        return tree;
    }

    public void append(Person person) {
        tree.add(person);
    }

    public void newTreePerson(Heritage hr, String name, char gender, String mother, String father) {
        if (mother != null && father != null) {
            Person personMother = hr.persByName(mother);
            Person personFather = hr.persByName(father);
            if (personMother != null && personFather != null) {
                personFather.coition(personMother);
                Person newPerson = new Person(name, gender, personMother, personFather);
                append(newPerson);
            } else {
                System.out.println("Some person not found!");
            }
        } else {
            Person newPerson = new Person(name, gender);
            append(newPerson);
        }
    }
}
