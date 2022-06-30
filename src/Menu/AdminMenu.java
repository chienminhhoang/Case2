package Menu;

import Product.Bicycle;
import ProductManager.BicycleManage;
import ProductManager.CarManager;
import ProductManager.MotoBikeManager;

import java.util.Scanner;

public class AdminMenu {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        CarManager carManager = new CarManager();
        MotoBikeManager motoBikeManager = new MotoBikeManager();
        BicycleManage bicycleManage = new BicycleManage();
        int choice;

        do {
            System.out.println("|--------------------------|");
            System.out.println("|___________Menu___________|");
            System.out.println("| 1. Add    Transport      |");
            System.out.println("| 2. Remove Transport      |");
            System.out.println("| 3. Update Transport      |");
            System.out.println("| 4. Search Transport by ID|");
            System.out.println("| 0.Exit                   |");
            System.out.println("|--------------------------|");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("|--------------------------|");
                        System.out.println("|___________Menu___________|");
                        System.out.println("| 1. Add    Car            |");
                        System.out.println("| 2. Add    Bicycle        |");
                        System.out.println("| 3. Add    Moto bike      |");
                        System.out.println("| 0.Exit                   |");
                        System.out.println("|--------------------------|");
                        choice = scanner.nextInt();
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
                        }
                        break;

                    } while (choice != 0);
                    break;
                case 2:
                    do {
                        System.out.println("|--------------------------|");
                        System.out.println("|___________Menu___________|");
                        System.out.println("| 1. Remove    Car         |");
                        System.out.println("| 2. Remove    Bicycle     |");
                        System.out.println("| 3. Remove    Moto bike   |");
                        System.out.println("| 0.Exit                   |");
                        System.out.println("|--------------------------|");
                        choice = scanner.nextInt();
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
                        }
                        break;
                    } while (choice != 0);
                case 3:
                    do {
                        System.out.println("|--------------------------|");
                        System.out.println("|___________Menu___________|");
                        System.out.println("| 1. Update    Car         |");
                        System.out.println("| 2. Update    Bicycle     |");
                        System.out.println("| 3. Update    Moto bike   |");
                        System.out.println("| 0.Exit                   |");
                        System.out.println("|--------------------------|");
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                carManager.updateCarById(scanner);
                                break;
                            case 2:
                                System.out.println("Enter id moto bike want to update");
                                bicycleManage.UpdateBicycleById(scanner);
                                break;
                            case 3:
                                motoBikeManager.updateMotoBikeById(scanner);
                                break;
                        }
                        break;
                    } while (choice != 0);


                case 4:
                    do {
                        System.out.println("|--------------------------|");
                        System.out.println("|___________Menu___________|");
                        System.out.println("| 1. Search    Car         |");
                        System.out.println("| 2. Search    Bicycle     |");
                        System.out.println("| 3. Search    Moto bike   |");
                        System.out.println("| 0.Exit                   |");
                        System.out.println("|--------------------------|");
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                do {
                                    System.out.println("|--------------------------|");
                                    System.out.println("|___________Menu___________|");
                                    System.out.println("| 1. display all Car       |");
                                    System.out.println("| 2. search by Car id      |");
                                    System.out.println("| 0.Exit                   |");
                                    System.out.println("|--------------------------|");
                                    choice = scanner.nextInt();
                                    switch (choice) {
                                        case 1:
                                            carManager.displayAll();
                                            break;
                                        case 2:
                                            carManager.displayById(scanner);
                                            break;
                                    }
                                    break;
                                } while (choice != 0);
                            case 2:
                                do {
                                    System.out.println("|--------------------------|");
                                    System.out.println("|___________Menu___________|");
                                    System.out.println("| 1. display all Moto bike |");
                                    System.out.println("| 2. search by Moto Bike id|");
                                    System.out.println("| 0.Exit                   |");
                                    System.out.println("|--------------------------|");
                                    choice = scanner.nextInt();
                                    switch (choice) {
                                        case 1:
                                            motoBikeManager.displayAll();
                                            break;
                                        case 2:
                                            motoBikeManager.displayById(scanner);
                                            break;
                                    }
                                    break;
                                } while (choice != 0);
                                break;
                            case 3:
                                do {
                                    System.out.println("|--------------------------|");
                                    System.out.println("|___________Menu___________|");
                                    System.out.println("| 1. display all bicycle   |");
                                    System.out.println("| 2. search by bicycle id  |");
                                    System.out.println("| 0.Exit                   |");
                                    System.out.println("|--------------------------|");
                                    choice = scanner.nextInt();
                                    switch (choice) {
                                        case 1:
                                            bicycleManage.displayAll();
                                            break;
                                        case 2:
                                            bicycleManage.displayById(scanner);

                                            break;
                                    }
                                    break;
                                } while (choice != 0);
                                break;
                        }

                    } while (choice != 0);
                    break;

            }

        } while (choice != 0);
    }
}
