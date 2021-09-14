package ua.boderto.provider;

import com.google.inject.Provider;
import ua.boderto.robot.impl.SimpleRobot;
import ua.boderto.weapon.Weapon;
import ua.boderto.weapon.impl.FlameThrower;
import ua.boderto.weapon.impl.LazerGun;
import ua.boderto.weapon.impl.SteelSword;

import java.util.ArrayList;
import java.util.List;

public class SuperRobotProvider implements Provider<SimpleRobot> {

    @Override
    public SimpleRobot get() {
        List<Weapon> weapons = List.of(new SteelSword(), new LazerGun(), new FlameThrower());
        return new SimpleRobot("Super Robot", new ArrayList<>(weapons));
    }
}
