public class Exercise2 {
    // [Thực hành] Static Property
    public static void main(String[] args) {
        Car car1 = new Car("Halia 3","Mozarc 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Halia 6","Mozarc 6");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("Halia 8","Mozarc 8");
        System.out.println(Car.numberOfCars);
    }
}
