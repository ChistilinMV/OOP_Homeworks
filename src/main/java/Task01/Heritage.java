package Task01;

import java.util.ArrayList;

public class Heritage {
    ArrayList<Person> tree;

    public Heritage(Tree familyTree){
        tree = familyTree.getTree();
    }

    public ArrayList<Person> childs(Person person) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person tr:tree) {
            if (tr.mother == person || tr.father == person) {
                result.add(tr);
            }
        }
        return result;
    }

    public ArrayList<Person> parents(Person person) {
        ArrayList<Person> result = new ArrayList<>();
        if (person.getFather() == null || person.getMother() == null) {
            result.add(new Person("-= God Father =-", '0', null, null));
        } else{
            result.add(person.mother);
            result.add(person.father);
        }
        return result;
    }
}
