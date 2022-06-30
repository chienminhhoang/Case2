package ProductManager;

import Product.Brand;
import Product.Car;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class CarManager implements Serializable {
    public CarManager() {
        brands.add(new Brand("BMW"));
        brands.add(new Brand("Toyota"));
        brands.add(new Brand("Honda"));
        brands.add(new Brand("Mazda"));
        brands.add(new Brand("Mitsubishi"));
        brands.add(new Brand("Mercedes"));
        brands.add(new Brand("Chevrolet"));
        brands.add(new Brand("Daewoo"));
        brands.add(new Brand("Kia"));
        brands.add(new Brand("Lexus"));
        brands.add(new Brand("Hyundai"));
        brands.add(new Brand("Nissan"));
        brands.add(new Brand("Subaru"));
        brands.add(new Brand("Lexus"));
        brands.add(new Brand("Suzuki"));
        brands.add(new Brand("VinFast"));
    }

    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<Brand> brands = new ArrayList<>();


    public void addCar(Scanner scanner) {
        Car car = createCar(scanner);
        cars.add(car);

    }

    public Car createCar(Scanner scanner) {
        System.out.println("Enter Brand");
        int choice = scanner.nextInt();
        scanner.nextLine();
        Brand brand = null;
        for (int i = 0; i <brands.size() ; i++) {
            if((i+1) == choice){
                brand = brands.get(i);
            }

        }
        System.out.println("Enter Id Car:");
        int id = scanner.nextInt();
        System.out.println("Enter name car:");
        String name = scanner.next();
        System.out.println("Enter Color car:");
        String color = scanner.next();
        System.out.println("Enter date car");
        int date = scanner.nextInt();
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
        Car car = new Car(id,name,color,date,brand,condition,vehicles,address,gearbox,window,km);
        return car;

    }
public void displayBrandSame(Scanner scanner){
        displayBrandMoto();
    System.out.println("Enter brand:");
    int list= Integer.parseInt(scanner.nextLine());
    Brand brand = null;
    for (int i = 0; i <brands.size() ; i++) {
        if((i+1)== list){
            brand=brands.get(i);

        }

    }
    for (Car car: cars
         ) {
        if(car.getBrandName().equals(brand.getName()));{
            System.out.println(car);
        }

    }
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
    public void displayBrandMoto(){
        for (int i = 0; i <brands.size() ; i++) {
            System.out.println((i+1)+"."+brands.get(i).getName());
        }
    }

    public void updateCarById(Scanner scanner) {
        int id = scanner.nextInt();
        System.out.println("Enter id car want to update");
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                Car car = createCar(scanner);
                cars.add(car);
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
