package combat;

import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon {
    private int ammunition;
    private RangedWeaponType type;

    public RangedWeapon(String name, int damage, int range, int ammunition, RangedWeaponType type) {
        super(name, damage, range);
        this.ammunition = ammunition;
        this.type = type;
    }

    @Override
    public void attack() {
        super.attack();
        ammunition--;
    }

    @Override
    public String toString() {
        return "RangedWeapon{type= " + type + ", name='" + super.getName() +"', damage=" + super.getDamage() +
            ", range=" + super.getRange() + ", ammunition=" + ammunition +
                '}';
    }
}
