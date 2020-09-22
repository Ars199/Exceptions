public class Car {
    private String brand;
    private int speed;
    private double price;

    Car() {
    }

    Car(String brand, int speed, double price) {
        this.brand = brand;
        this.price = price;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void startEngine() throws StartException {
        int start = (int) (Math.random() * 20);
        if (start % 2 == 0) {
            throw new StartException(start + " Автомобиль НЕ завелся " + this.brand);
        } else {
            System.out.println(start + " Автомобиль успешно завелся " + this.brand);

        }
    }
}
