import character.Character;
import character.Noble;
import character.type.Gender;
import character.type.House;
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

        Noble targaryen = new Noble("Targaryen", "Fire and Blood", Gender.FEMALE, Set.of(House.TARGARYEN));
        System.out.println(targaryen.toString());
        targaryen.addHouse(House.BARATHEON);
        System.out.println(targaryen);
        System.out.println();
        System.out.println(Character.getWorldPopulation());

        targaryen.die();

        Character arya = new Noble("Arya", "Winterfell", Gender.FEMALE, Set.of(House.STARK));
        System.out.println(arya.hasWeapons()); // False

        arya.addWeapon(new MeleeWeapon("Valyrian steel dagger", 20, 1, MeleeWeaponType.DAGGER));
        arya.addWeapon(new RangedWeapon("Stolen bow", 10, 40, 5, RangedWeaponType.BOW));

        arya.removeWeapon("Stolen bow");

        System.out.println(arya.getWeapons()); // [MeleeWeapon{type=DAGGER, name='Valyrian steel dagger', damage=20, range=1}]

        Noble cersei = new Noble("Cersei", "Casterly Rock", Gender.FEMALE, Set.of(House.LANNISTER));
        cersei.addHouse(House.BARATHEON);
        cersei.addCoins("gold", 1); // 1 gold -> 100 copper
        cersei.addCoins("silver", 1);
        cersei.addCoins("silver", 2); // 1+2 silver -> 30 copper
        cersei.addCoins("copper", 3); // 3 copper -> 3 copper
        System.out.println(cersei); // Cersei of house(s) LANNISTER, BARATHEON has 133 wealth in copper.
    }
}
