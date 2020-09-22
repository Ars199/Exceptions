public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 220, 3.5);
        Car car1 = new Car("Жига", 320, 0.5);
        try {
            car.startEngine();

        } catch (StartException e) {
            e.printStackTrace();
        }
        try {
            car1.startEngine();

        } catch (StartException e) {
            e.printStackTrace();
        }
    }
}
