package Task06;

import Task06.Humans.Warrior;

public class Battle {
    private Warrior attacker;
    private Warrior defender;

    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public Warrior run() {
        while (true) {
            int attack = attacker.harm();
            defender.incomeDamage(attack);
            System.out.printf("Warrior %s give harm %d\n Warrior %s block %d damage, left %d HP %d ARM\n", attacker.getName(), attack, defender.getName(), defender.blocked(), defender.getHp(), defender.getArmor());
            if (!defender.isAlive()) {
                System.out.printf("Warrior %s is dead, %s winner", defender.getName(), attacker.getName());
                return attacker;
            }
            attack = defender.harm();
            attacker.incomeDamage(attack);
            System.out.printf("Warrior %s return harm %d\n Warrior %s block %d damage, left %d HP %d ARM\n", defender.getName(), attack, attacker.getName(), attacker.blocked(), attacker.getHp(), attacker.getArmor());
            if (!attacker.isAlive()) {
                System.out.printf("Warrior %s is dead, %s winner", attacker.getName(), defender.getName());
                return defender;
            }
        }
    }
}
