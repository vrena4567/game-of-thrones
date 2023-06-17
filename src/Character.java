public class Character {
    private String name;
    private String birthPlace;

    private Gender GENDER;

    public Character(String name, String birthPlace, Gender GENDER) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.GENDER = GENDER;
    }


    public Gender getGENDER() {
        return GENDER;
    }

    public void setGENDER(Gender GENDER) {
        if(getGENDER().equals(Gender.MALE)) {
            this.GENDER = GENDER;
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

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", GENDER=" + GENDER +
                '}';
    }
}
