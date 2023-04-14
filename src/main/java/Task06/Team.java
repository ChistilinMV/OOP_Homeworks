package Task06;

import Task06.Humans.Archer;
import Task06.Humans.Knight;
import Task06.Humans.Person;
import Task06.Humans.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Person> implements Iterable<T> {
    List<T> persons = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return persons.iterator();
    }

    public Team<T> addPersons(T person) {
        persons.add(person);
        return this;
    }

    @Override
    public String toString() {
        return "Team{" +
                "persons=" + persons +
                '}';
    }

    public int maxRange() {
        int max = 0;
        for (T person : this) {
            if (person instanceof Archer) {
                Archer archer = (Archer) person;
                if (archer.getRange() > max) {
                    max = archer.getRange();
                }
            }
        }
        return max;
    }

    public int maxArmor() {
        int max = 0;
        for (T person : this) {
            Warrior soldier = (Warrior) person;
            if (soldier.getArmor() > max) {
                max = soldier.getArmor();
            }
        }
        return max;
    }

}
