package Day50.ObjectsInLists;

public class Animal {
    private String name;
    private boolean isDoggy;

    public Animal(String name, boolean isDoggy) {
        this.name = name;
        this.isDoggy = isDoggy;
    }

    public String getName() {
        return name;
    }

    public boolean getBoolean() {
        return isDoggy;
    }

    @Override
    public String toString() {
        return name + "is a dog = " + isDoggy;
    }

}
