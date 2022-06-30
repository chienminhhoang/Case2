package ProductManager;

import Product.Bicycle;
import Product.Brand;
import Product.MotoBike;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class BicycleManage implements Serializable {
    public BicycleManage() {
        brands.add(new Brand("Ander"));
        brands.add(new Brand("Asama"));
        brands.add(new Brand("Baileys"));
        brands.add(new Brand("Bianchi"));
        brands.add(new Brand("CannonDale"));
        brands.add(new Brand("DaHon"));
        brands.add(new Brand("ForNix"));
        brands.add(new Brand("Galaxy"));
        brands.add(new Brand("Jett"));
        brands.add(new Brand("Martin"));
        brands.add(new Brand("Giant"));
    }

    ArrayList<Bicycle> bicycles = new ArrayList<>();
    ArrayList<Brand> brands = new ArrayList<>();

    public  void addBicycles (Scanner scanner){
        Bicycle bicycle = createBicycle(scanner);
        bicycles.add(bicycle);
    }

    public Bicycle createBicycle(Scanner scanner){
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
        System.out.println("Enter name bicycle:");
        String name = scanner.next();
        System.out.println("Enter Color :");
        String color = scanner.next();
        System.out.println("Enter date ");
        int date = scanner.nextInt();
        System.out.println("Enter condition:");
        String condition = scanner.next();
        System.out.println("Enter vehicles:");
        String vehicles=scanner.next();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        return new Bicycle(id,name,color,date,brand,condition,vehicles,age);
    }
    public void displayBrandSame2(Scanner scanner){
        displayBrandB();
        System.out.println("Enter Brand:");
        int list = Integer.parseInt(scanner.nextLine());
        Brand brand = null;
        for (int i = 0; i <brands.size() ; i++) {
            if((i+1)==list){
                brand = brands.get(i);
            }
        }
        for (Bicycle bicycle:bicycles
             ) {
            if(bicycle.getBrandName().equals(brand.getName()));{
                System.out.println(bicycle);
            }

        }
    }
    public void displayBrandB(){
        for (int i = 0; i <brands.size() ; i++) {
            System.out.println((i+1)+"."+brands.get(i).getName());
        }
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
    public void UpdateBicycleById(Scanner scanner){
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
        for (Bicycle bicycle: bicycles ){
            System.out.println(bicycle);
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
