public class Noble extends Character {
    private House house;
    private int wealth;

    public Noble(String name, String birthPlace, Gender GENDER, House house, int wealth) {
        super(name, birthPlace, GENDER);
        this.house = house;
        this.wealth = wealth;
    }

    @Override
    public String toString() {
        return getName() + " of house " + this.house + " has " + this.wealth + " gold dragons.";
    }
}
