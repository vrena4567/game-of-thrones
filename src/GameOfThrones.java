import java.util.Set;

public class GameOfThrones {
    public static void main(String[] args) {
        Character stark = new Character("Stark", "Winter is coming", Gender.MALE);
        stark.setGENDER(Gender.EUNUCH);
        System.out.println(stark);

        Noble targaryen = new Noble("Targaryen", "Fire and Blood", Gender.FEMAILE, 5000, Set.of(House.TARGARYEN));
        System.out.println(targaryen.toString());
        targaryen.addHouse(House.BARATHEON);
        System.out.println(targaryen);
        System.out.println();
        System.out.println(Character.getWorldPopulation());

        targaryen.die();


    }
}
