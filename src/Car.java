public class Car {
    public static int numberOfCars;

    private String name;
    private String engine;
    public Car(String name, String engine) {
        numberOfCars++;

        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
