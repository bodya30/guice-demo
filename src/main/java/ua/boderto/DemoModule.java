package ua.boderto;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import ua.boderto.annotation.SuperRobot;
import ua.boderto.provider.SuperRobotProvider;
import ua.boderto.robot.impl.SimpleRobot;
import ua.boderto.weapon.Weapon;
import ua.boderto.weapon.impl.FlameThrower;
import ua.boderto.weapon.impl.LazerGun;
import ua.boderto.weapon.impl.SteelSword;

import java.util.ArrayList;
import java.util.List;

public class DemoModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).toInstance("Robot-knight");
        bind(Weapon.class).to(SteelSword.class);
        bind(SimpleRobot.class).annotatedWith(SuperRobot.class).toProvider(SuperRobotProvider.class);
    }

    @Provides
    public List<Weapon> createBasicWeaponCollection(Weapon weapon) {
        //To make collection modifiable
        return new ArrayList<>(List.of(weapon));
    }

    @Provides
    @Named("Modern")
    public SimpleRobot createModernRobot() {
        List<Weapon> weapons = List.of(new LazerGun(), new FlameThrower());
        return new SimpleRobot("Modern Robot", new ArrayList<>(weapons));
    }
}
