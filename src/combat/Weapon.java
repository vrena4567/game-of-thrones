package combat;

import java.util.HashSet;
import java.util.Set;

public abstract class Weapon {
    private String name;
    private int damage;
    private int range;
    private Set<Weapon> weaponSet = new HashSet<>();

    public Weapon(String name, int damage, int range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }

    public void addWeapon(Weapon weapon) {
        this.weaponSet.add(weapon);
    }

    public void removeWeapon(String weaponName) {
        for (Weapon actual : weaponSet) {
            if (actual.name.equals(weaponName)) {
                this.weaponSet.remove(actual);
            } else {
                System.out.println("There is no such weapon in the weapon set.");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void attack() {

    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                " }";
    }
}
