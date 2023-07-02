public enum House {
    STARK("Winter is coming", "Közeleg a tél", "wolf"),
    LANNISTER("Hear Me Roar", "Hald üvöltésem", "lion"),
    TARGARYEN("Fire and Blood", "Tűz és vér", "dragon"),
    BARATHEON("Ours is the Fury", "Miénk a harag", "stag"),
    GREYJOY("We Do Not Sow", "Mi nem vetünk", "kraken"),
    TYRELL("Growing Strong", "Erőssé növünk", "rose");

    private String jelmondatAngolul;
    private String jelmondatMagyarul;
    private String sigil;

    private House(String jelmondatAngolul, String jelmondatMagyarul, String sigil){
        this.jelmondatAngolul = jelmondatAngolul;
        this.jelmondatMagyarul = jelmondatMagyarul;
        this.sigil = sigil;
    }

    public String getJelmondatAngolul() {
        return jelmondatAngolul;
    }


    public String getJelmondatMagyarul() {
        return jelmondatMagyarul;
    }


    public String getSigil() {
        return sigil;
    }
}