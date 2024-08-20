package car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void whenCreateCarItsSpeedIsCeroTest() {
        Car newcar = new Car();
        Assertions.assertEquals(0, newcar.speed);
    }

    @Test
    public void whenSpeedUpACarItsSpeedIncreasesTest() {
        Car newcar = new Car();
        newcar.speedUp(30);
        Assertions.assertEquals(30, newcar.speed);
    }

    @Test
    public void whenSlowDownACarItsSpeedReducesTest() {
        Car newcar = new Car();
        newcar.speedUp(50);
        newcar.slowDown(20);
        Assertions.assertEquals(30, newcar.speed);
    }

    @Test
    public void whenSlowDownACarItsSpeedCantBeLessThanZeroTest() {
        Car newcar = new Car();
        newcar.speedUp(50);
        newcar.slowDown(80);
        Assertions.assertEquals(0, newcar.speed);
    }
}
