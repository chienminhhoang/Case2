package Menu;

import Product.Bicycle;
import ProductManager.BicycleManage;
import ProductManager.CarManager;
import ProductManager.MotoBikeManager;

import java.util.Scanner;

public class AdminMenu {
    private static CarManager carManager = new CarManager();
    private static BicycleManage bicycleManage = new BicycleManage();
    private static MotoBikeManager motoBikeManager = new MotoBikeManager();

    public static void runByAdmin() {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("|--------------------------|");
            System.out.println("|___________Menu___________|");
            System.out.println("| 1. Add    Transport      |");
            System.out.println("| 2. Remove Transport      |");
            System.out.println("| 3. Update Transport      |");
            System.out.println("| 4. Search Transport by ID|");
            System.out.println("| 0.Exit                   |");
            System.out.println("|--------------------------|");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    removeTransportMenu();
                    break;
                case 3:
                    UpdateTransportMenu();
                    break;
                case 4:
                  SearchTransport();
                    break;
                default:
                    return;
            }
        }
    }


    private static void addMenu() {
        while (true) {
            System.out.println("|--------------------------|");
            System.out.println("|___________Menu___________|");
            System.out.println("| 1. Add    Car            |");
            System.out.println("| 2. Add    Bicycle        |");
            System.out.println("| 3. Add    Moto bike      |");
            System.out.println("| 0.Exit                   |");
            System.out.println("|--------------------------|");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    carManager.displayBrandMoto();
                    carManager.addCar(scanner);
                    break;
                case 2:
                    bicycleManage.displayBrandB();
                    bicycleManage.addBicycles(scanner);
                    break;
                case 3:
                    motoBikeManager.displayBrand();
                    motoBikeManager.addMotoBike(scanner);
                    break;
                default:
                    return;
            }
        }
    }

    private static void removeTransportMenu() {
        while (true) {
            System.out.println("|--------------------------|");
            System.out.println("|___________Menu___________|");
            System.out.println("| 1. Remove    Car         |");
            System.out.println("| 2. Remove    Bicycle     |");
            System.out.println("| 3. Remove    Moto bike   |");
            System.out.println("| 0.Exit                   |");
            System.out.println("|--------------------------|");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    carManager.removeCarById(scanner);
                    break;
                case 2:
                    bicycleManage.removeBicycleById(scanner);
                    break;
                case 3:
                    motoBikeManager.removeMotoBikeById(scanner);
                    break;
                default:
                    return;
            }
        }
    }

    private static void UpdateTransportMenu() {
        while (true) {

            System.out.println("|--------------------------|");
            System.out.println("|___________Menu___________|");
            System.out.println("| 1. Update    Car         |");
            System.out.println("| 2. Update    Bicycle     |");
            System.out.println("| 3. Update    Moto bike   |");
            System.out.println("| 0.Exit                   |");
            System.out.println("|--------------------------|");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    carManager.updateCarById(scanner);
                    break;
                case 2:
                    bicycleManage.UpdateBicycleById(scanner);
                    break;
                case 3:
                    motoBikeManager.updateMotoBikeById(scanner);
                    break;
                default:
                    return;
            }
        }
    }

    private static void SearchTransport() {
        System.out.println("|--------------------------|");
        System.out.println("|___________Menu___________|");
        System.out.println("| 1. Search    Car         |");
        System.out.println("| 2. Search    Moto bike   |");
        System.out.println("| 3. Search    bicycle     |");
        System.out.println("| 0.Exit                   |");
        System.out.println("|--------------------------|");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                SearchCar();
                break;
            case 2:
                SearchMotoBike();
            case 3:
                SearchBicycle();
                break;
            default:

                return;
        }
    }


    private static void SearchCar() {
        while (true) {
            System.out.println("|--------------------------|");
            System.out.println("|___________Menu___________|");
            System.out.println("| 1. display all Car       |");
            System.out.println("| 2. search by Car id      |");
            System.out.println("| 0.Exit                   |");
            System.out.println("|--------------------------|");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    carManager.displayAll();
                    break;
                case 2:
                    carManager.displayById(scanner);
                    break;
                default:
                    return;
            }
        }

    }

    private static void SearchMotoBike() {
        while (true) {
            System.out.println("|--------------------------|");
            System.out.println("|___________Menu___________|");
            System.out.println("| 1. display all Moto bike |");
            System.out.println("| 2. search by Moto Bike id|");
            System.out.println("| 0.Exit                   |");
            System.out.println("|--------------------------|");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bicycleManage.displayAll();
                    break;
                case 2:
                    bicycleManage.displayById(scanner);
                    break;
                default:
                    return;
            }

        }

    }

    private static void SearchBicycle() {
        while (true) {
            System.out.println("|--------------------------|");
            System.out.println("|___________Menu___________|");
            System.out.println("| 1. display all bicycle   |");
            System.out.println("| 2. search by bicycle id  |");
            System.out.println("| 0.Exit                   |");
            System.out.println("|--------------------------|");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    motoBikeManager.displayAll();
                    break;
                case 2:
                    motoBikeManager.displayById(scanner);

                    break;
                default:
                    return;

            }
        }
    }


}