package ua.boderto.weapon.impl;

import ua.boderto.weapon.Weapon;

public class SteelSword implements Weapon {

    @Override
    public void apply() {
        System.out.println("Steel sword is applied.");
    }
}
