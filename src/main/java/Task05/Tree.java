package Task05;

import java.util.ArrayList;

public class Tree {
    private ArrayList<Person> tree = new ArrayList<>();

    public ArrayList<Person> getTree() {
        return tree;
    }

    public void setTree(ArrayList<Person> tree) {
        this.tree = tree;
    }
    public void append(Person person) {
        tree.add(person);
    }

    public void newTreePerson(Heritage hr, String name, char gender, String mother, String father) {
        if (mother != null && father != null) {
            Person pmother = hr.persByName(mother);
            Person pfather = hr.persByName(father);
            if (pmother != null && pfather != null) {
                Person newperson = new Person(name, gender, pmother, pfather);
                pfather.coition(pmother);
                append(newperson);
            } else {
                System.out.println("Some person not found!");
            }
        } else {
            Person newperson = new Person (name, gender);
            append(newperson);
        }
    }
}
