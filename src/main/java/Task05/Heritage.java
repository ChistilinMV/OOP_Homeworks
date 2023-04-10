package Task05;

import java.util.ArrayList;

public class Heritage {
    ArrayList<Person> tree;

    public Heritage(Tree familyTree)
    {
        tree = familyTree.getTree();

    }
    public ArrayList<Person> child(Person person) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person tr:tree) {
            if (tr.mother == person || tr.father == person) {
                result.add(tr);
            }
        }
        return result;
    }
    //
    public ArrayList<Person> parents(Person person) {
        ArrayList<Person> result = new ArrayList<>();
        if (person.getFather() == null || person.getMother() == null) {
            result.add(new Person("-= God Father =-", '0'));
        } else{
            result.add(person.mother);
            result.add(person.father);
        }
        return result;
    }
//    public ArrayList<Person> grandparents(Person person){
//        ArrayList<Person> result_parents = new ArrayList<>();
//        result_parents = parents(person);
//        if (result_parents.get(0).getGender() != '0' && result_parents.get(1).getGender() != '0') {
//           // for ()
//        }
//    }

    public Person persByName(String name) {
        for (Person tr:tree) {
            if (tr.name.equals(name)) {
                return tr;
            }
        }
        return null;
    }
    public void printParents(String name) {
        Person searchPers = persByName(name);
        if (searchPers != null) {
            System.out.println("Parens of " + name + ": " + parents(searchPers));
        }
        else {
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
