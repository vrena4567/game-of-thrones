# Game of Thrones

Készíts egy `GameOfThrones` osztályt és írj bele egy `main()` metódust!
Itt fog játszódni az igazi trónok harca!

## Valar Morghulis
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

## Winter is Coming

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

## The seed is strong
Előfordulhat, hogy egy szereplő több nemes házhoz is tartozik 
(pl. hivatalosan Joffrey nemcsak Lannister, de Baratheon is), 
ezért módosítsd a `Noble` osztály`house` fieldjét, hogy több házhoz is tartozhasson egy szereplő!
Hogyan oldod ezt meg?

<details><summary>Megoldás</summary><pre>
private final Set &lt House &gt houses;
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
