package Login;
import Menu.AdminMenu;

import java.io.*;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerAccount implements Serializable {
    boolean check = false;
    public  static ArrayList<Account> accounts = new ArrayList<>();
    public Account createAccount(Scanner scanner){
        System.out.println("1.Enter new account");
        String userName = scanner.next();
        System.out.println("2. Enter new passWord");
        String passWord =scanner.next();
        return new Account(userName,passWord);


    }
    public void addAccount(Scanner scanner){

        Account account = createAccount(scanner);
        accounts.add(account);
        writeDocuments(accounts);
    }

    public void writeDocuments(ArrayList<Account> accounts) {
        File file = new File("Account.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(accounts);
            objectOutputStream.close();
        }catch (Exception e){
            System.out.println("File already exists");
        }
    }
    public  void readDocuments(){
        File file = new File("Account.txt");
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            accounts = (ArrayList<Account>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e){
            System.out.println("File already exists");
        }
    }
    public void inputAccount(Scanner scanner){
        System.out.println("Enter user name");
        String userName= scanner.next();
        System.out.println("Enter pass word");
        String passWord = scanner.next();
        Login login = new Login(userName,passWord);
        if(checkAdmin(login)){

        } else {
            checkAdmin(login);
        }
    }
    public  boolean checkAdmin(Login login){
        if(login.getUserName().equals("admin")&& login.getPassWord().equals("admin")){
            return true;
        } else {
            return false;
        }
    }
    public void checkAccount(Login login){
        for (Account account : accounts) {
            if(login.getUserName().equals(account.getUserName()) && login.getPassWord().equals(account.getPassWord() )){
               check = true;
            }
            else {
                System.out.println("A user with this user name or password does not exist");
                MenuLogin.MenuLogin();
            }

        }
    }
}
