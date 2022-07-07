package ProductManager;

import HandleFile.FileIO;
import Menu.UserMenu;
import Product.Bicycle;
import Product.Brand;
import Product.MotoBike;

import java.io.*;
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
        fileIO = new FileIO();
        bicycles = fileIO.readDataFromFile("bicycles.txt");
    }

    ArrayList<Bicycle> bicycles = new ArrayList<>();
    ArrayList<Brand> brands = new ArrayList<>();
    FileIO fileIO;

    public  void addBicycles (Scanner scanner){
        Bicycle bicycle = createBicycle(scanner);
        bicycles.add(bicycle);
        fileIO.writeDataToFile(bicycles, "bicycles.txt");
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
        scanner.nextLine();
        System.out.println("Enter name bicycle:");
        String name = scanner.nextLine();
        System.out.println("Enter Color :");
        String color = scanner.nextLine();
        System.out.println("Enter date ");
        int date = scanner.nextInt();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter condition:");
        String condition = scanner.nextLine();
        System.out.println("Enter vehicles:");
        String vehicles = scanner.nextLine();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        scanner.nextLine();
        return new Bicycle(id,name,color,date,price,brand,condition,vehicles,age);
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
    public void addToCartById(Scanner scanner){
        int id =scanner.nextInt();
        for(int i =0;i<bicycles.size();i++){
            if(bicycles.get(i).getId() == id){
                UserMenu.cart.put(bicycles.get(i),1);
            }
        }
    }
    public void removeBicycleById(Scanner scanner){

        System.out.println("Enter id moto bike want to remove");
        int id = scanner.nextInt();
        for (int i = 0; i <bicycles.size() ; i++) {
            if(bicycles.get(i).getId() == id){
                bicycles.remove(i);
            }

        }
    }
    public void UpdateBicycleById(Scanner scanner){

        System.out.println("Enter id moto bike want to update");
        int id = scanner.nextInt();
        for (int i = 0; i <bicycles.size() ; i++) {
            if(bicycles.get(i).getId() == id ){
              Bicycle bicycle = createBicycle(scanner);
              bicycles.set(i,bicycle);
              fileIO.writeDataToFile(bicycles, "bicycles.txt" +
                      "");
            }
        }
    }
    public void displayAll(){
        for (Bicycle bicycle: bicycles ){
            System.out.println(bicycle);
        }
    }
    public void displayById(Scanner scanner){
        System.out.println("Enter id ");
        int id = scanner.nextInt();
        for (int i = 0; i <bicycles.size() ; i++) {
        if(bicycles.get(i).getId() == id){
            System.out.println(bicycles.get(i).toString());
        }
        }
    }

    public  void writeDocuments(ArrayList<Bicycle>bicycles){
        File file  = new File("Bicycle.txt");
        try {if(file.exists()){
            file.createNewFile();
        }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(bicycles);
            objectOutputStream.close();
        }catch (Exception e){
            System.out.println("File already exists");
        }
    }
public void readDocuments(ArrayList<Bicycle>bicycles){
        File file = new File("Bicycle.txt");
try{
    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
    bicycles = (ArrayList<Bicycle>) objectInputStream.readObject();
    objectInputStream.close();
}        catch (Exception e){
    System.out.println("File already exists");
}
}

}
