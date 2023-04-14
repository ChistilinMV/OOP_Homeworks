package Task06;

import Task06.Humans.Archer;
import Task06.Humans.Knight;
import Task06.Shields.Buckler;
import Task06.Shields.Hoplon;
import Task06.Shields.NoShield;
import Task06.Weapons.Bow;
import Task06.Weapons.Knife;

/*На основе работы на уроке.
 Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов.
 Реструктуризировать код в конечных классах семейства Warriors.
 Добавить метод определения минимального щита члена команды в команде.
 * Продумать, как можно сделать воина без щита.*/
public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons(new Archer("Robin", 100, new Bow(20), new Buckler()))
                .addPersons(new Archer("Bobin", 100, new Bow(15), new Buckler()));
        knights.addPersons(new Knight("John", 150, new Knife(), new Buckler()))
                .addPersons(new Knight("Adam", 150, new Knife(), new Buckler()));
        Archer archer1 = new Archer("Robin", 100, new Bow(20), new Buckler());
        Archer archer2 = new Archer("Bobin", 100, new Bow(15), new Hoplon());
        System.out.println(archer1);
        System.out.println(archer2);
        Battle fight = new Battle(archer1, archer2);
        fight.run();
    }
}
