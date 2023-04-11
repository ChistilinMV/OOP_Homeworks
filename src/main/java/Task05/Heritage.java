package Task05;

import java.util.ArrayList;
import java.util.List;

public class Heritage {
    List<Person> tree;

    public Heritage(Tree familyTree) {
        tree = familyTree.getTree();
    }

    public List<Person> child(Person person) {
        List<Person> result = new ArrayList<>();
        for (Person tr : tree) {
            if (tr.getMother() == person || tr.getFather() == person) {
                result.add(tr);
            }
        }
        return result;
    }

    public List<Person> parents(Person person) {
        List<Person> result = new ArrayList<>();
        if (person.getFather() == null || person.getMother() == null) {
            result.add(new Person(Human.GODNAME, Human.GODGEN));
        } else {
            result.add(person.getMother());
            result.add(person.getFather());
        }
        return result;
    }

    public Person persByName(String name) {
        for (Person tr : tree) {
            if (tr.getName().equals(name)) {
                return tr;
            }
        }
        return null;
    }

    public void printParents(String name) {
        Person searchPers = persByName(name);
        if (searchPers != null) {
            System.out.println("Parens of " + name + ": " + parents(searchPers));
        } else {
            System.out.println("Person " + name + " not found");
        }
    }

    public void printChild(String name) {
        Person searchPers = persByName(name);
        if (searchPers != null) {
            System.out.println("Children of " + name + ": " + child(searchPers));
        } else {
            System.out.println("Person " + name + " not found");
        }
    }
}
