public enum House {
    STARK("Winter is coming", "Közeleg a tél"),
    LANNISTER("Hear Me Roar", "Hald üvöltésem"),
    TARGARYEN("Fire and Blood", "Tűz és vér"),
    BARATHEON("Ours is the Fury", "Miénk a harag"),
    GREYJOY("We Do Not Sow", "Mi nem vetünk"),
    TYRELL("Growing Strong", "Erőssé növünk");

    private String jelmondatAngolul;
    private String jelmondatMagyarul;

    private House(String jelmondatAngolul, String jelmondatMagyarul){
        this.jelmondatAngolul = jelmondatAngolul;
        this.jelmondatMagyarul = jelmondatMagyarul;
    }


}