package ProductManager;

import Product.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarManager {
    public CarManager() {
    }

    ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Scanner scanner) {
        Car car = createCar(scanner);
        cars.add(car);

    }

    public Car createCar(Scanner scanner) {
        System.out.println("Enter Id Car:");
        int id = scanner.nextInt();
        System.out.println("Enter name car:");
        String name = scanner.next();
        System.out.println("Enter Color car:");
        String color = scanner.next();
        System.out.println("Enter date car");
        int date = scanner.nextInt();
        System.out.println("Enter Brand:");
        String brand = scanner.next();
        System.out.println("Enter condition:");
        String condition = scanner.next();
        System.out.println("Enter vehicles:");
        String vehicles = scanner.next();
        System.out.println("Enter address:");
        String address = scanner.next();
        System.out.println("Enter gearbox");
        String gearbox = scanner.next();
        System.out.println("Enter window in car");
        int window = scanner.nextInt();
        System.out.println("Enter KM");
        int km = scanner.nextInt();
        Car car = new Car(id, name, color, date, brand, condition, vehicles, address, gearbox, window, km);
        return car;

    }

    public void removeCarById(Scanner scanner) {
        int id = scanner.nextInt();
        System.out.println("Enter id car want to remove:");
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                cars.remove(i);
            }
        }
    }

    public void updateCarById(Scanner scanner) {
        int id = scanner.nextInt();
        System.out.println("Enter id car want to update");
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                Car car = createCar(scanner);
            }

        }
    }

    public void displayAll() {
        for (Car c : cars
        ) {
            System.out.println(cars);
        }
    }

    public void displayById(Scanner scanner) {
        System.out.println("Enter id want to display:");
        int id = scanner.nextInt();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                System.out.println(i);
            }
        }

    }

}
