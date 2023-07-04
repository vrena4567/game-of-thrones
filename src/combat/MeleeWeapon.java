package combat;

import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon{
    private int range = 1;
    private MeleeWeaponType type;

    public MeleeWeapon(String name, int damage, int range, MeleeWeaponType type) {
        super(name, damage, range);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "MeleeWeapon{" +
                "range=" + range +
                ", type=" + type +
                '}';
    }
}
