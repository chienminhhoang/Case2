package ProductManager;

import HandleFile.FileIO;
import Menu.UserMenu;
import Product.Brand;
import Product.Car;

import java.io.*;
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

        fileIO = new FileIO();
        cars = fileIO.readDataFromFile("cars.txt");
    }

    ArrayList<Car> cars;
    ArrayList<Brand> brands = new ArrayList<>();

    FileIO fileIO;


    public void addCar(Scanner scanner) {
        Car car = createCar(scanner);
        cars.add(car);
        fileIO.writeDataToFile(cars, "cars.txt");
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
        scanner.nextLine();
        System.out.println("Enter name car:");
        String name = scanner.nextLine();
        System.out.println("Enter Color car:");
        String color = scanner.nextLine();
        System.out.println("Enter date car");
        int date = scanner.nextInt();
        System.out.println("Enter price");
        int price =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter condition:");
        String condition = scanner.nextLine();
        System.out.println("Enter vehicles:");
        String vehicles = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter gearbox");
        String gearbox = scanner.nextLine();
        System.out.println("Enter window in car");
        int window = scanner.nextInt();
        System.out.println("Enter KM");
        int km = scanner.nextInt();
        scanner.nextLine();
        Car car = new Car(id,name,color,date,price,brand,condition,vehicles,address,gearbox,window,km);
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

        System.out.println("Enter id car want to remove:");
        int id = scanner.nextInt();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                cars.remove(i);
                fileIO.writeDataToFile(cars, "cars.txt");
            }
        }
    }
    public void displayBrandMoto(){
        for (int i = 0; i <brands.size() ; i++) {
            System.out.println((i+1)+"."+brands.get(i).getName());
        }
    }

    public void updateCarById(Scanner scanner) {
        System.out.println("Enter id car want to update");
        int id = scanner.nextInt();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                Car car = createCar(scanner);
                cars.set(i, car);
                fileIO.writeDataToFile(cars, "cars.txt");
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
                System.out.println(cars.get(i).toString());
            }
        }

    }

    public void addToCartById(Scanner scanner){
        System.out.println("Enter id want add to cart");
        int id= scanner.nextInt();
        for(int i =0;i<cars.size();i++){
            if(cars.get(i).getId() == id){
                UserMenu.cart.put(cars.get(i),1);
            }
        }
    }
    public void writeDocuments(ArrayList<Car>cars ){
        File file = new File("Car.txt");
        try{
            if(file.exists()){
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(cars);
            objectOutputStream.close();
        } catch (Exception e){
            System.out.println("File already exists");
        }
    }
    public void readDocuments(ArrayList<Car>cars){
        File file = new File("Car.txt");
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            cars = (ArrayList<Car>) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            System.out.println("File already exists");
        }
    }


}
