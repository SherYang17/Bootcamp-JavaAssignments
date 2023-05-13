package Day50.OverloadingPractice;

public class CounterConstructors {
    private int value;

    public CounterConstructors(int startValue) {
        this.value = startValue;
    }

    public CounterConstructors() {
        this.value = 0;
    }

    public int value() {     // a method called "value" that returns the current value of the counter as an int.
        return this.value;
    }

    public void increase() { // a method called 'increase' that increases the value by 1 and does not return anything.
        this.value++;        // https://www.baeldung.com/java-unary-operators
    }

    public void decrease() { // a method called 'decrease' that decreases the value by 1 and does not return anything..
        this.value--;        // https://www.baeldung.com/java-unary-operators
    }

    // increase
    public void increase (int increaseBy) {
        if (increaseBy >= 0) {
            this.value = this.value + increaseBy;
        }
    }

    // decrease
    public void decrease (int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value = this.value - decreaseBy;
        }
    }
}
