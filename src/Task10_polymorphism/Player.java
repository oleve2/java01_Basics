package Task10_polymorphism;

import Task10_polymorphism.weapons.*;

public class Player {
    private Weapon[] weaponSlots;

    // constructor
    public Player() {
        weaponSlots = new Weapon[] {
                new Pistol(),
                new Machinegun(),
                new RPG(),
                new Rogatka(),
                new WaterPistol(),
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // если значение slot некорректно, то выйти из метода написав об этом в консоль
        if ((slot <0) || (slot > weaponSlots.length-1)) {
            System.out.println("weapon slot in out of range [0.." + (weaponSlots.length-1) + "]");
            return;
        }
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }

}
