# When you play the game of thrones, you win or you die. There is no middle ground.

Készíts egy `src` nevű, forrásskódokat tartalmazó mappát: 
`File` &rarr; `Project Structure` &rarr; 
`Modules` (Project Settings szekció) &rarr; jobb klikk a mappán &rarr; `New Directory` &rarr;
Hozz létre egy `src` nevűt &rarr; felette `Mark as` opciónál válaszd, hogy `Sources`!

Készíts ebbe a mappában egy  `GameOfThrones` osztályt és írj bele egy `main()` metódust!
Itt fog játszódni az igazi trónok harca!

## Valar Morghulis!
Valar morghulis, avagy minden embernek meg kell halnia. 
De ahhoz, hogy meg tudjanak halni, először létre kéne hoznunk őket.
Vegyél fel egy `Character` osztályt, ami taralmazza a szereplő nevét (`name`)
és születési helyét (`birthPlace`)! 

Készíts egy konstruktort, ami ezeket a paramétereket várja és állítja be!

A szereplő neve élete során változhat, ám a születési helye nem. 
Hogyan oldanád meg ezt kód szinten?

<details><summary>Megoldás</summary><p>
Írj gettert és settert a névnek, a születési helyet állítsd final-re és csak gettert írj hozzá!
</p></details>

## Yes, all men must die. But we are not men.
Bővítsük a `Character` osztályunkat, hogy el tudja tárolni a szereplő nemét. Ehhez készíts egy
`Gender` enumot, aminek a lehetséges értékei: `MALE`, `FEMALE`.

## If you think this has a happy ending, you haven't been paying attention.
Sajnos ebben a brutális világban előfordul csonkítás, kasztrálás is,
ezért szükségünk lesz egy harmadik `Gender` értékre: `EUNUCH`.
A `Character` osztályban írj gettert és settert is a nemhez, ám
a setter biztosítsa azt a működést, hogy csak férfit tudunk eunuch-ká alakítani,
más változtatást ne lehessen végrehajtani!
Ellenőrizd le a metódusod működését!

## Winter is Coming!

Westerosban nemes családok versengenek egymással évszázadok óta.
Ezen családokat házaknak hívjuk és minden háznak van egy jelmondata.

Írj egy `House` enumot, ami tartalmazza a főbb házakat és képes lekérni az adott házak
jelmondatait magyarul és angolul!
- Stark
  - Winter is Coming 
  - Közeleg a tél
- Lannister
  - Hear Me Roar
  - Halld üvöltésem
- Targaryen
  - Fire and Blood
  - Tűz és vér
- Baratheon
  - Ours is the Fury
  - Miénk a harag 
- Greyjoy
  - We Do Not Sow
  - Mi nem vetünk
- Tyrell
  - Growing Strong
  - Erőssé növünk

_Természetesen szabad több házat is felvenni. :)_

## A lion doesn’t concern himself with the opinions of a sheep.
Nem mindenkinek adatik meg, hogy nemes családba szülessen, ezáltal egy nagyobb házhoz tartozzon.
Készíts egy `Noble` osztályt, ami a `Character` osztályt egészíti ki egy `House` típusú házzal/családdal
(`house`) és egy egyszerű szám típusú vagyonnal (`wealth`)!
Az osztály toString metódusa jelenítse meg a nemes ember adatait ebben a formátumban:
`Cersei of house LANNISTER has 500000 gold dragons.`

## The seed is strong.
Előfordulhat, hogy egy szereplő több nemes házhoz is tartozik 
(pl. hivatalosan Joffrey nemcsak Lannister, de Baratheon is), 
ezért módosítsd a `Noble` osztály`house` fieldjét, hogy több házhoz is tartozhasson egy szereplő!
Hogyan oldod ezt meg?

<details><summary>Megoldás</summary><pre>
private final Set &lt character.type.House &gt houses;
</pre></details>

Nevezd át a `house` fieldet `houses`-ra - hiszen most már az fejezi ki jobban ennek a fieldnek a célját.
Adj meg neki alapértelmezett értékként egy üres HashSet-et:
`private final Set<House> houses = new HashSet<>();`

Írj konstruktort a `Noble` osztályhoz, majd próbáld ki!

Implementálj egy `addHouse(house: House)` és egy `removeHouse(house: House)` metódust és 
próbáld is ki őket!

Ha ezzel megvagy, szemet szúrhat, hogy a toString() metódus, most ebben a formátumban írja ki
a nemes emberünket: `Cersei of house [BARATHEON, LANNISTER] has 500000 gold dragons`.
Módosítsd, hogy a kapcsos zárójelek lekerüljenek a kiírásból! 

<details><summary>Megoldás</summary><p>
Ehhez több jó megoldás létezik,
érdemes külön felvenni egy <code>getHousesAsString()</code> metódust, ami visszaadja egy String-be összefűzve a
házakat!
</p></details>

## When the snows fall and the white winds blow, the lone wolf dies, but the pack survives.
A házaknak nem csak jelmondataik, de címerállataik is vannak. Bővíts a `House` enumot egy `sigil` mezővel
és állítsd be az értékeit a házaknak megfelelően:
- Stark: wolf
- Lannister: lion
- Targaryen: dragon
- Baratheon: stag
- Greyjoy: kraken
- Tyrell: rose

## You're mine and I'm yours. If we die we die. But first we'll live.
Tartsd nyilván a világ populációját (avagy hány példány lett létrehozva a `Character` osztályból)!
Írj gettert (`getWorldPopulation()`) ehhez az információhoz és próbáld ki!

## There is only one god and his name is Death, and there is only one thing we say to Death: "Not today."
A népesség nyilvántartása nem csak a születéseket, hanem a halálozásokat is magába foglalja.
Készíts egy `Mortal` interfészt, ami tartalmaz egy `die()` metódust!
Implementáld ezt a `Character` osztályban, hogy csökkenjen a populáció, ha meghal valaki!
Próbáld ki!

## What is dead may never die. But rises again, harder and stronger.
Írd felül ezt a működést, ha nemes ember (`Noble`) hal meg, akkor írja ki 
a ház(ai)nak a jelmondat(ai)t angolul!


## Stick 'em with the pointy end!
Hogyan oldanád meg, hogy minden karakternek lehessenek különböző típusú fegyverei és ezek a fegyverek
jellemezhetőek legyenek adatokkal?
Az alábbi fegyvertípusokat különböztetjük meg:

**Közelharc** (`melee`): 
- kard (`sword`)
- balta (`axe`)
- buzogány (`mace`)
- lándzsa (`spear`)
- tőr (`dagger`)

**Távolharc** (`ranged`):
- íj (`bow`)
- számszeríj (`crossbow`)
- dobókés (`throwing knife`)
- gerely (`javelin`)

Készíts egy absztrakt `Weapon` osztályt és származztass le belőle egy `MeleeWeapon` és
egy `RangedWeapon` osztályt. Minden fegyvernek legyen egy neve (`name`), egy sebzése
(`damage`), egy hatótávolsága (`range`) és lehessen vele támadni (`attack()`)!

A közelharci fegyvereknek alapértelmezetten legyen a hatótávolsága 1!

A távolharci fegyvereknek legyen egy lőszer (`ammunition`) változója, ami mindig 
csökkenjen, amikor támadnak vele!

Készíts egy `combat` package-et és abba mozgasd át ezeket az osztályokat!
(Ha nem működik, manuálisan is be tudod írni az osztály tetjére, hogy `package combat;`
és utána az IntelliJ ajánlásával átmozgatni!)

Készíts a `combat` packege-en belül egy `type` package-et, ahol vegyél fel egy
`MeleeWeaponType` és egy `RangedWeaponType` enumot, töltsd fel a felsorolt értékekkel!
Legyen a `MeleeWeapon` osztálynak egy `MeleeWeaponType` típusú `type` nevű változója,
majd a távolharci fegyvereknél is oldd meg hasonlóképpen a típus beállítását!

Írj konstruktorokat, próbáld ki a fegyverek léterhozását!
Ne felejtsd el a `toString()` metódust overrideolni, hogy kiírja az összes adatát!

Minden szereplőnek legyen lehetősége fegyvert birtokolni, ehhez vegyél fel egy `weapons`
fieldet, ami `Set<Weapon>` típusú (így lehet benne `MeleeWeapon` és `RangedWeapon`
típusú fegyvereket is tárolni), alapértelmezett inicializáld egy üres (Hash)Settel!
Írj hozzá `addWeapon(weapon: Weapon)` és `removeWeapon(weaponName: String)` metódusokat
és egy gettert!


Ha mindent jól csináltál, az alábbi kódsornak működnie kell:
```
character.Character arya = new character.Noble("Arya", "Winterfell", character.type.Gender.FEMALE, Set.of(character.type.House.STARK), 30);
System.out.println(arya.hasWeapons()); // False 

arya.addWeapon(new MeleeWeapon("Valyrian steel dagger", 20, MeleeWeaponType.DAGGER));
arya.addWeapon(new RangedWeapon("Stolen bow", 10, 40, 5, RangedWeaponType.BOW));

arya.removeWeapon("Stolen bow");

System.out.println(arya.getWeapons()); // [MeleeWeapon{type=DAGGER, name='Valyrian steel dagger', damage=20, range=1}]
```

## A Lannister always pays his debts.
A nemes embereknél a vagyont (`wealth`) jelenleg egy egyszerű szám típussal jellemezzük,
ám Westerosban nem csak egy féle pénznem van. Megkülönöztetünk arany (`golden`),
ezüst (`silver`) és réz (`copper`) érméket is.

Hogyan oldanád meg, hogy ezeket külön el tudjuk tárolni?
Hogyan módosítanád ezt az elgondolt megoldást, ha felmerül, hogy több fajta
érme (vagy vagyontárgy) is előfordulhat, amit nem tudunk előre?

Tároljuk most el egy Mapben ezeket az értékeket, ahol a kulcs legyen az érme
neve, az érték pedig az összértéke ezeknek az érméknek! 
A `wealth` fieldet töröld ki, helyette vedd fel ezt a mapet `coins` néven és
állíts be neki egy üres mapet alapértelmezett értékként!

Írd át a `Noble` konstuktorát, hogy ne várja paraméterként a vagyont semmilyen formában,
azt majd csak "születés" után tudjuk hozzáadni!

Miket kell most módosítanod a `Noble` osztályban?
Milyen metódusok megvalósítására van szükség, hogy biztosítsuk a helyes működést?

<details><summary>Megoldás</summary><pre>
public void addCoins(String coinType, int amount) {
  // TODO
}
public void removeCoins(String coinType, int amount) { 
  // TODO
}
</pre></details>

Ezen felül kelleni fog még egy `getWealth()` metódus is, ami visszaadja
az érméink összértékét! Az egyszerűség kedvéért legyen
- 1 arany = 100 bronz
- 1 ezüst = 10 bronz

és a többi érmetípussal még nem foglalkozunk!

Az alábbi működést várjuk:
```
Noble cersei = new Noble("Cersei", "Casterly Rock", Gender.FEMALE, Set.of(House.LANNISTER));
cersei.addHouse(House.BARATHEON);
cersei.addCoins("gold", 1); // 1 gold -> 100 copper
cersei.addCoins("silver", 1);
cersei.addCoins("silver", 2); // 1+2 silver -> 30 copper
cersei.addCoins("copper", 3); // 3 copper -> 3 copper
System.out.println(cersei); // Cersei of house LANNISTER, BARATHEON has 133 wealth in copper.
```

<details><summary>Segítség</summary><p>
Inicializálj egy totalWealth változót, adj neki értékül nullát!
Iterálj végig a Map Entry-jein: mentsd el egy változóba az érme nevét, 
és egy másik változóba az értékét! Utána egy switchen belül álltísd a totalWealth-et
az érme nevének megfelelően!
</p></details>

<details><summary>Még több segítség</summary><pre>
switch (coinType) {
    case "gold" -> totalWealth += amount * 100;
    case "silver" -> totalWealth += amount * 10;
    case "copper" -> totalWealth += amount;
}
</pre></details>


## Chaos is a ladder.
Rengeteg osztályt definiáltunk, rendezd őket package-ekbe!
Az osztályhierarchia legyen az alábbi:
- character
  - Character.java
  - Mortal.java
  - Noble.java
  - _type_
    - Gender.java
    - House.java
- combat
  - MeleeWeapon.java
  - RangedWeapon.java
  - Weapon.java
  - _type_
    - MeleeWeaponType.java
    - RangedWeaponType.java
- GameOfThrones.java

Ha kell, rendezd az importokat!


