package ProductManager;

import HandleFile.FileIO;
import Product.Brand;
import Product.MotoBike;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class MotoBikeManager implements Serializable {
    public MotoBikeManager(){
        brands.add(new Brand("Honda"));
        brands.add(new Brand("Yamaha"));
        brands.add(new Brand("Suzuki"));
        brands.add(new Brand("PiaGGio"));
        brands.add(new Brand("Kawasaki"));
        brands.add(new Brand("SYM"));
        brands.add(new Brand("Ducati"));
        brands.add(new Brand("Benelli"));
        brands.add(new Brand("brixton"));
        brands.add(new Brand("KTM"));
        brands.add(new Brand("Bazan"));
        brands.add(new Brand("BMW"));
        brands.add(new Brand("GPX"));
        fileIO = new FileIO();
        motoBikes= fileIO.readDataFromFile("motoBikes.txt");
    }
    ArrayList<MotoBike> motoBikes = new ArrayList<>();
    ArrayList<Brand> brands = new ArrayList<>();
    FileIO fileIO;
    public void addMotoBike(Scanner scanner){
        MotoBike motoBike = createMotoBike(scanner);
        motoBikes.add(motoBike);
        fileIO.writeDataToFile(motoBikes, "motoBikes.txt");
    }
    public MotoBike createMotoBike(Scanner scanner){
        System.out.println("Enter brand");
        int choice= scanner.nextInt();
        scanner.nextLine();
        Brand brand = null;
        for (int i = 0; i <brands.size() ; i++) {
            if((i+1) ==     choice){
                brand= brands.get(i);

            }
            
        }
        System.out.println("Enter Id :");
        int id = scanner.nextInt();
        System.out.println("Enter name :");
        String name = scanner.next();
        System.out.println("Enter Color :");
        String color = scanner.next();
        System.out.println("Enter date ");
        int date = scanner.nextInt();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        System.out.println("Enter condition:");
        String condition = scanner.next();
        System.out.println("Enter vehicles:");
        String vehicles=scanner.next();
        System.out.println("Enter cubicCentimetre");
        String cubicCentimetre= scanner.next();

        MotoBike motoBike = new MotoBike(id,name,color,date,price,brand,condition,vehicles,cubicCentimetre);
        return motoBike;
    }
    public void displayBrand2(Scanner scanner){
        displayBrand();
        System.out.println("Enter brand:");
        int list = Integer.parseInt(scanner.nextLine());
        Brand brand = null;
        for (int i = 0; i <brands.size() ; i++) {
            if((i+1)== list){
                brand = brands.get(i);

            }}
        for (MotoBike motoBike: motoBikes
                 ) {
            if(motoBike.getBrandName().equals(brand.getName()));{
                System.out.println(motoBike);
            }
        }

        }


    public void displayBrand(){
        for (int i = 0; i <brands.size() ; i++) {
            System.out.println((i+1)+"."+brands.get(i).getName());
            
        }
    }
    public void removeMotoBikeById(Scanner scanner){
        System.out.println("Enter id moto bike want to remove");
        int id = scanner.nextInt();

        for (int i = 0; i <motoBikes.size() ; i++) {
            if(motoBikes.get(i).getId() == id){
                motoBikes.remove(i);
            }

        }
    }
    public void updateMotoBikeById(Scanner scanner){
        System.out.println("Enter id ");
        int id= scanner.nextInt();

        for (int i = 0; i <motoBikes.size() ; i++) {
            if(motoBikes.get(i).getId() == id ){
                MotoBike motoBike = createMotoBike(scanner);
                motoBikes.set(i,motoBike);
                fileIO.writeDataToFile(motoBikes,"motoBike.txt");
            }
        }
    }
    public void displayAll(){
        for (MotoBike m :motoBikes
             ) {
            System.out.println(motoBikes);

        }
    }
    public void displayById(Scanner scanner){
        int id = scanner.nextInt();
        for (int i = 0; i <motoBikes.size() ; i++) {
            if(motoBikes.get(i).getId() == id){
                System.out.println(i);
            }
        }
    }
    public void writeDocuments(ArrayList<MotoBike> motoBikes){
        File file = new File("MotoBike.txt");
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(motoBikes);
            objectOutputStream.close();
        } catch (Exception e){
            System.out.println("File already exists");
        }
    }
    public void readDocuments(ArrayList<MotoBike>motoBikes){
        File file = new File("MotoBike.txt");
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            motoBikes = (ArrayList<MotoBike>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e){
            System.out.println("File already exists");
        }
    }
}
