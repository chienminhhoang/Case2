package Menu;

import ProductManager.BicycleManage;
import ProductManager.CarManager;
import ProductManager.MotoBikeManager;

import java.util.Scanner;

public class UserMenu {
    public static void UserMenu() {
        Scanner scanner = new Scanner(System.in);
        CarManager carManager = new CarManager();
        MotoBikeManager motoBikeManager = new MotoBikeManager();
        BicycleManage bicycleManage = new BicycleManage();

        int choice;
        do{
            System.out.println("_____________Menu_____________");
            System.out.println("1.Add transport");
            System.out.println("2.Remove Transport ");
            System.out.println("3. Update Transport");
            System.out.println("4.Search TranSport");
            System.out.println("5.Buy Transport");
            System.out.println("6.Display cart");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice){

            }
        }
    }
}