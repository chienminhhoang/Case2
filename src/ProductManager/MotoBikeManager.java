package ProductManager;

import Product.MotoBike;

import java.util.ArrayList;
import java.util.Scanner;

public class MotoBikeManager {
    public MotoBikeManager(){}
    ArrayList<MotoBike> motoBikes = new ArrayList<>();
    public void addMotoBike(Scanner scanner){
        MotoBike motoBike = createMotoBike(scanner);
        motoBikes.add(motoBike);
    }
    public MotoBike createMotoBike(Scanner scanner){
        System.out.println("Enter Id :");
        int id = scanner.nextInt();
        System.out.println("Enter name :");
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
        System.out.println("Enter cubicCentimetre");
        String cubicCentimetre= scanner.next();

        MotoBike motoBike = new MotoBike(id,name,color,date,brand,condition,vehicles,cubicCentimetre);
        return motoBike;
    }
    public void removeMotoBikeById(Scanner scanner){
        int id = scanner.nextInt();
        System.out.println("Enter id moto bike want to remove");
        for (int i = 0; i <motoBikes.size() ; i++) {
            if(motoBikes.get(i).getId() == id){
                motoBikes.remove(i);
            }

        }
    }
    public void updateMotoBikeById(Scanner scanner){
        int id= scanner.nextInt();
        System.out.println("Enter id moto bike want to update");
        for (int i = 0; i <motoBikes.size() ; i++) {
            if(motoBikes.get(i).getId() == id ){
                MotoBike motoBike = createMotoBike(scanner);
                motoBikes.add(motoBike);
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
}
