package design_mode.adapter.entity_nonliving;

/**
 * @author automannn@163.com
 * @time 2018/9/13 17:54
 */
public class WeaponDescriptor {
    private Float weaponLenght;
    private Float weaponWeight;


    public WeaponDescriptor() {
    }

    public WeaponDescriptor(Float weaponLenght, Float weaponWeight) {
        this.weaponLenght = weaponLenght;
        this.weaponWeight = weaponWeight;
    }

    public Float getWeaponLenght() {
        return weaponLenght;
    }

    public Float getWeaponWeight() {
        return weaponWeight;
    }
}
