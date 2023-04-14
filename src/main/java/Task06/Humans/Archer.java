package Task06.Humans;

import Task06.Shields.Armor;
import Task06.Weapons.Throwing;

public class Archer extends Warrior<Throwing, Armor> {
    public Archer(String name, int hp, Throwing weapon, Armor shield) {
        super(name, hp, weapon, shield);
    }

    public int getRange() {
        return rand.nextInt(weapon.getDistance() + 1);
    }

    @Override
    public String toString() {
        return "Archer { " +
                super.toString() +
                " }";
    }
}
