package character;

import character.type.Gender;
import character.type.House;

import java.util.*;

public class Noble extends Character implements Mortal {
    private Map<String, Integer> coins = new HashMap<>();
    private Set<House> houses = new HashSet<>();

    public Noble(String name, String birthPlace, Gender gender, Set<House> houses) {
        super(name, birthPlace, gender);
        this.houses = new HashSet<>(houses);
    }

    public void addCoins(String coinType, int amount) {
        coins.put(coinType, coins.getOrDefault(coinType, 0) + amount);
    }

    public void removeCoins(String coinType, int amount) {
        int currentAmount = coins.getOrDefault(coinType, 0);
        if (currentAmount >= amount) {
            coins.put(coinType, currentAmount - amount);
        } else {
            coins.put(coinType, 0);
        }
    }

    public int getCoinsInCopper() {
        int totalWealth = 0;
        for (Map.Entry<String, Integer> actualEntry : coins.entrySet()) {
            String coinType = actualEntry.getKey();
            int amount = actualEntry.getValue();
            switch (coinType) {
                case "gold" -> totalWealth += amount * 100;
                case "silver" -> totalWealth += amount * 10;
                case "copper" -> totalWealth += amount;
            }
        }
        return totalWealth;
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
        return getName() + " of house " + getHousesAsString() + " has " + getCoinsInCopper() + " wealth in copper.";
    }
}
