package Day54.Application;
import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isSensorOn;
    private Random random;

    public TemperatureSensor() {
        this.isSensorOn = false;
        this.random = new Random();

    }

    @Override
    public boolean isOn() {
        return this.isSensorOn;
    }

    @Override
    public void setOn() {
        this.isSensorOn = true;
    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        if (!this.isSensorOn) {
            throw new IllegalStateException("Error: The Temperature is off");
        }
        // 0 is considered a number so 61 so that the numbers are 0 - 60
        // if you did (60), the numbers will be 0-59
        return random.nextInt(61) - 30; // https://sentry.io/answers/random-ints/#:~:text=We%20can%20use%20the%20java,pseudorandom%2C%20uniformly%20distributed%20int%20value.&text=Here%2C%20the%20bound%20value%20calculation,upper%20value%20in%20our%20range.
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.setOn();
        System.out.println(sensor.read());  // testing to make sure methods above work, random number should generate

    }


}

