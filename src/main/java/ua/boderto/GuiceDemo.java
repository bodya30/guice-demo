package ua.boderto;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import ua.boderto.annotation.SuperRobot;
import ua.boderto.robot.impl.SimpleRobot;


public class GuiceDemo {

    private SimpleRobot defaultRobot;
    private SimpleRobot modernRobot;
    private SimpleRobot superRobot;

    @Inject
    public GuiceDemo(SimpleRobot defaultRobot,
                     @Named("Modern") SimpleRobot modernRobot,
                     @SuperRobot SimpleRobot superRobot) {
        this.defaultRobot = defaultRobot;
        this.modernRobot = modernRobot;
        this.superRobot = superRobot;
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DemoModule());
        GuiceDemo demo = injector.getInstance(GuiceDemo.class);
        demo.run();
    }

    public void run() {
        System.out.println("Should be knight robot with steel sword.");
        defaultRobot.attack();
        System.out.println();

        System.out.println("Should be modern robot with lazer and flame thrower.");
        modernRobot.attack();
        System.out.println();

        System.out.println("Should be super robot with sword, lazer and flame thrower.");
        superRobot.attack();
        System.out.println();
    }

    public SimpleRobot getDefaultRobot() {
        return defaultRobot;
    }

    public SimpleRobot getModernRobot() {
        return modernRobot;
    }

    public SimpleRobot getSuperRobot() {
        return superRobot;
    }

}
