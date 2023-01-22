package lesson07;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Engine engine = new Engine(2000, "KIA");
        Driver driver = new Driver("Иванов Иван Иванович", 23, 5);
        SportCar sportCar = new SportCar("SPORTAGE", 1500, driver, engine, 300);
        sportCar.start();
        sportCar.turnLeft();
        sportCar.turnRight();
        sportCar.stop();
        System.out.println(sportCar);
        Car car = new Car("BMW", 2000, driver, engine);
        Car car2 = new Car("LADA", 1000, driver, engine);
        System.out.println(car.equals(car2));
        Car cloned = (Car) car.clone();
        System.out.println("cloned=" + cloned);
    }
}
