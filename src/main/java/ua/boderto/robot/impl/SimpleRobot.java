package ua.boderto.robot.impl;

import com.google.inject.Inject;
import ua.boderto.weapon.Weapon;

import java.util.List;

public class SimpleRobot extends AbstractRobot {

    @Inject
    public SimpleRobot(String name, List<Weapon> weapons) {
        setName(name);
        setWeapons(weapons);
    }
}
