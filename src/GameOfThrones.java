public class GameOfThrones {
    public static void main(String[] args) {
        Character stark = new Character("Stark", "Winter is coming", Gender.MALE);
        stark.setGENDER(Gender.EUNUCH);
        System.out.println(stark);


    }
}
