package combat;

import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon{
    private int range;
    private MeleeWeaponType type;

    public MeleeWeapon(String name, int damage, int range, MeleeWeaponType type) {
        super(name, damage, range);
        this.range = 1;
        this.type = type;
    }

    @Override
    public String toString() {
        return "MeleeWeapon{type= " + type + ", name='" + super.getName() +"', damage=" + super.getDamage() +
                ", range=" + range +
                '}';
    }
}
