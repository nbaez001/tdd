package car;

public class Car {
    public int speed;

    public void speedUp(int acceleration) {
        speed += acceleration;
    }

    public void slowDown(int deceleration) {
        speed -= deceleration;
        if (speed < 0) {
            speed = 0;
        }
    }
}
