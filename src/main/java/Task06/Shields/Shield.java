package Task06.Shields;

public abstract class Shield implements Armor {
    private String name;
    private int armor;
    private int adsorbed;

    public Shield(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }

    public boolean isBroken() {
        return armor > 0;
    }

    public int getAdsorbed() {
        return adsorbed;
    }

    public String getName() {
        return name;
    }

    public int getArmor() {
        return armor;
    }

    public int getDamage(int damage) {
        int leftArmor = Math.max(armor - damage, 0);
        adsorbed = armor - leftArmor;
        armor = leftArmor;
        return armor;
    }

    @Override
    public String toString() {
        return "Shield { " +
                this.name +
                ", armor = " +
                this.armor +
                " }";
    }
}
