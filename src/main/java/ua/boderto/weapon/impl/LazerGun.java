package ua.boderto.weapon.impl;

import ua.boderto.weapon.Weapon;

public class LazerGun implements Weapon {

    @Override
    public void apply() {
        System.out.println("Lazer gun is applied.");
    }
}
