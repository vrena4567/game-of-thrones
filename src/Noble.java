import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Noble extends Character implements Mortal {
    private int wealth;
    private Set<House> houses = new HashSet<>();

    public Noble(String name, String birthPlace, Gender gender, int wealth, Set<House> houses) {
        super(name, birthPlace, gender);
        this.wealth = wealth;
        this.houses = new HashSet<>(houses);
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public Set<House> getHouses() {
        return houses;
    }

    public void setHouses(Set<House> houses) {
        this.houses = houses;
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public void removeHouse(House house) {
        houses.remove(house);
    }

    public String getHousesAsString() {
        StringBuilder stringHouses = new StringBuilder();
        for (House house : houses) {
            stringHouses.append(house).append(", ");
        }
        stringHouses.delete(stringHouses.length() - 2, stringHouses.length());
        return stringHouses.toString();
    }
    @Override
    public void die() {
        for (House house : houses) {
            System.out.println((house.getJelmondatAngolul()));
        }
        super.die();
    }

    @Override
    public String toString() {
        return getName() + " of house " + getHousesAsString() + " has " + this.wealth + " gold dragons.";
    }
}
