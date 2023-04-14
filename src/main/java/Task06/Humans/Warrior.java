package Task06.Humans;

import Task06.Shields.Armor;
import Task06.Weapons.Weapon;

import java.util.Random;

public class Warrior<T extends Weapon,  P extends Armor> extends Person {
    protected T weapon;
    protected P shield;
    protected static Random rand = new Random();

    public Warrior(String name, int hp, T weapon, P shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }

    public int getArmor() {
        return shield.getArmor();
    }

    public int harm() {
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rand.nextInt(weapon.damage() + 1);
        }
        return damage;
    }

    public void incomeDamage(int damage) {
        if (shield.getDamage(damage) == 0) {
            reduceHp(damage - shield.getAdsorbed());
        }
    }

    public int blocked() {
        return shield.getAdsorbed();
    }

    @Override
    public String toString() {
        return "Warrior{" +
                getName() +
                ", hp = " + getHp() +
                ", weapon = " + weapon +
                ", shield = " + shield +
                '}';
    }
}
