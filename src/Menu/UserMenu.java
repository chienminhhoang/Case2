package Menu;

import Product.Bicycle;
import Product.Car;
import Product.MotoBike;
import Product.Transport;
import ProductManager.BicycleManage;
import ProductManager.CarManager;
import ProductManager.MotoBikeManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMenu {



    private static CarManager carManager = new CarManager();
    private static MotoBikeManager motoBikeManager = new MotoBikeManager();
    private static BicycleManage bicycleManage = new BicycleManage();

    public static HashMap<Transport, Integer> cart = new HashMap<>();

    public static void RunByUser() {


        while (true) {
            System.out.println("_____________Menu_____________");
            System.out.println("1.Show all product");
            System.out.println("2.Search TranSport by id");
            System.out.println("3.add Transport");
            System.out.println("4.Display cart");
            System.out.println("0. Exit");
            int choice;
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        motoBikeManager.displayAll();
                        carManager.displayAll();
                        bicycleManage.displayAll();
                        break;
                    case 2:
                        displayById();
                        break;
                    case 3:
                        addToCart();
                        break;
                    case 4: displayCart();
                    break;
                    default:
                        break;
                }
            }
        }


        private static void displayById () {
            while (true) {
                System.out.println("1.show car by id");
                System.out.println("2. show moto bike by id");
                System.out.println("3. show bicycle by id");
                System.out.println("0.exit ");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        carManager.displayById(scanner);
                        break;
                    case 2:
                        motoBikeManager.displayById(scanner);
                        break;
                    case 3:
                        bicycleManage.displayById(scanner);
                        break;
                    default:
                        return;

                }
            }
        }
        private static void addToCart () {
            while (true) {
                System.out.println("1. add car to cart");
                System.out.println("2. add moto bike to cart");
                System.out.println("3. add bicycles to cart");
                System.out.println("0. exit");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        carManager.addToCartById(scanner);
                        break;
                    case 2:
                        motoBikeManager.addToCartById(scanner);
                        break;
                    case 3:
                        bicycleManage.addToCartById(scanner);
                        break;
                    default:
                        return;
                }

            }
        }
        private static void displayCart(){
            System.out.println("---------CART----------");
            System.out.println();
            for (Map.Entry<Transport, Integer> entry : cart.entrySet()) {
                Transport key = entry.getKey();
                Integer value = entry.getValue();
                if (key instanceof Car) {
                    System.out.println(((Car) key).toString() + " - " + value);
                } else if (key instanceof Bicycle) {
                    System.out.println(((Bicycle) key).toString() + " - " + value);
                } else if (key instanceof MotoBike) {
                    System.out.println(((MotoBike) key).toString() + " - " + value);
                }
            }
        }
        private static void EditCart(){
            System.out.println("1.Pay product");
            System.out.println("2. remove product");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){

            }
        }

    }
