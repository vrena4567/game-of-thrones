package character;
import character.type.Gender;
import combat.Weapon;
import character.type.FightType;

import javax.swing.plaf.IconUIResource;
import java.util.HashSet;
import java.util.Set;

public class Character implements Mortal{
    private String name;
    private String birthPlace;
    private Gender GENDER;
    private static int counter = 0;
    private Set<Weapon> weaponSet = new HashSet<>();
    private int health = 100;


    public Character(String name, String birthPlace, Gender gender) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.GENDER = gender;
        counter++;
    }

    private void initiateFight(Weapon weapon, Character enemy, FightType fightType) {
        String fightTypeName = fightType == FightType.MELEE ? "melee" : "ranged";
        System.out.println(this.getName() + " engages in " + fightTypeName + " combat with " + enemy.getName() + ".");
        weapon.attack(this, enemy);
    }

    public void fight(Character enemy, FightType fightType) {
        if (this.hasWeapons()) {
            for (Weapon weapon : this.getWeapons()) {
                if ((fightType == FightType.MELEE && !weapon.isRanged()) ||
                        (fightType == FightType.RANGED && weapon.isRanged())) {
                    initiateFight(weapon, enemy, fightType);
                }
            }
        } else {
            System.out.println(this.getName() + " has no weapons to fight with.");
        }
    }
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.getName() + "'s health dropped to " + this.health + "/100.");
    }

    public boolean hasWeapons() {
        return this.weaponSet.size() == 0;
    }
    public void addWeapon(Weapon weapon) {
        this.weaponSet.add(weapon);
    }

    public void removeWeapon(String weaponName) {
        for (Weapon actual : weaponSet) {
            if (actual.getName().equals(weaponName)) {
                this.weaponSet.remove(actual);
                break;
            } else {
                System.out.println("There is no such weapon in the weapon set.");
            }
        }
    }

    public Gender getGENDER() {
        return GENDER;
    }

    public void setGENDER(Gender gender) {
        if(getGENDER().equals(Gender.MALE) && gender.equals(Gender.EUNUCH)) {
            this.GENDER = gender;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public static int getWorldPopulation() {
        return counter;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", GENDER=" + GENDER +
                '}';
    }
    public Set<Weapon> getWeapons() {
        return weaponSet;
    }

    @Override
    public void die() {
        counter--;
    }
}
