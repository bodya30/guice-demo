package ua.boderto.weapon.impl;

import ua.boderto.weapon.Weapon;

public class FlameThrower implements Weapon {

    @Override
    public void apply() {
        System.out.println("Flame thrower is applied");
    }

}
