package ProductManager;

import Product.Bicycle;
import Product.MotoBike;

import java.util.ArrayList;
import java.util.Scanner;

public class BicycleManage {
    public BicycleManage() {
    }
    ArrayList<Bicycle> bicycles = new ArrayList<>();
    public  void addBicycles (Scanner scanner){
        Bicycle bicycle = createBicycle(scanner);
        bicycles.add(bicycle);
    }
    public Bicycle createBicycle(Scanner scanner){
        System.out.println("Enter Id Car:");
        int id = scanner.nextInt();
        System.out.println("Enter name bicycle:");
        String name = scanner.next();
        System.out.println("Enter Color :");
        String color = scanner.next();
        System.out.println("Enter date ");
        int date = scanner.nextInt();
        System.out.println("Enter Brand:");
        String brand = scanner.next();
        System.out.println("Enter condition:");
        String condition = scanner.next();
        System.out.println("Enter vehicles:");
        String vehicles=scanner.next();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        return new Bicycle(id,name,color,date,brand,condition,vehicles,age);
    }
    public void removeBicycleById(Scanner scanner){
        int id = scanner.nextInt();
        System.out.println("Enter id moto bike want to remove");
        for (int i = 0; i <bicycles.size() ; i++) {
            if(bicycles.get(i).getId() == id){
                bicycles.remove(i);
            }

        }
    }
    public void updateMotoBikeById(Scanner scanner){
        int id = scanner.nextInt();
        System.out.println("Enter id moto bike want to update");
        for (int i = 0; i <bicycles.size() ; i++) {
            if(bicycles.get(i).getId() == id ){
              Bicycle bicycle = createBicycle(scanner);
              bicycles.add(bicycle);
            }
        }
    }
    public void displayAll(){
        for (Bicycle b: bicycles ){
            System.out.println(b);
        }
    }
    public void displayById(Scanner scanner){
        int id = scanner.nextInt();
        for (int i = 0; i <bicycles.size() ; i++) {
        if(bicycles.get(i).getId() == id){
            System.out.println(i);
        }
        }
    }

}
