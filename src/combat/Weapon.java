package combat;

import character.Character;
import character.type.FightType;

import java.util.HashSet;
import java.util.Set;

public abstract class Weapon {
    private String name;
    private int damage;
    private int range;
    public abstract boolean isRanged();

    public Weapon(String name, int damage, int range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
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

    public void attack(Character character, Character enemy) {
        enemy.takeDamage(this.getDamage());
        character.takeDamage(this.getDamage());
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
