import combat.MeleeWeapon;
import combat.RangedWeapon;
import combat.type.MeleeWeaponType;
import combat.type.RangedWeaponType;

import java.util.Set;

public class GameOfThrones {
    public static void main(String[] args) {
        Character stark = new Character("Stark", "Winter is coming", Gender.MALE);
        stark.setGENDER(Gender.EUNUCH);
        System.out.println(stark);

        Noble targaryen = new Noble("Targaryen", "Fire and Blood", Gender.FEMALE, 5000, Set.of(House.TARGARYEN));
        System.out.println(targaryen.toString());
        targaryen.addHouse(House.BARATHEON);
        System.out.println(targaryen);
        System.out.println();
        System.out.println(Character.getWorldPopulation());

        targaryen.die();

        Character arya = new Noble("Arya", "Winterfell", Gender.FEMALE,30, Set.of(House.STARK));
        System.out.println(arya.hasWeapons()); // False

        arya.addWeapon(new MeleeWeapon("Valyrian steel dagger", 20, 1, MeleeWeaponType.DAGGER));
        arya.addWeapon(new RangedWeapon("Stolen bow", 10, 40, 5, RangedWeaponType.BOW));

        arya.removeWeapon("Stolen bow");

        System.out.println(arya.getWeapons()); // [MeleeWeapon{type=DAGGER, name='Valyrian steel dagger', damage=20, range=1}]

    }
}
