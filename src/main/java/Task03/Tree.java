package Task03;

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
}
