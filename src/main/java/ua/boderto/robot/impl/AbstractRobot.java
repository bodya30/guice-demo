package ua.boderto.robot.impl;

import ua.boderto.robot.Robot;
import ua.boderto.weapon.Weapon;

import java.util.List;

public abstract class AbstractRobot implements Robot {

    private List<Weapon> weapons;
    private String name;

    @Override
    public void attack() {
        System.out.println(getName() + " attacks.");
        if (weapons != null && !weapons.isEmpty()) {
            weapons.forEach(Weapon::apply);
        }
    }

    @Override
    public String name() {
        return getName();
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
