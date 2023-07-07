import combat.Weapon;

import javax.swing.plaf.IconUIResource;
import java.util.HashSet;
import java.util.Set;

public class Character implements Mortal{
    private String name;
    private String birthPlace;
    private Gender GENDER;
    private static int counter = 0;
    private Set<Weapon> weaponSet = new HashSet<>();


    public Character(String name, String birthPlace, Gender gender) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.GENDER = gender;
        counter++;
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
    public String getWeapons() {
        return weaponSet.toString();
    }

    @Override
    public void die() {
        counter--;
    }
}
