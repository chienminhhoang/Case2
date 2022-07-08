package Login;

import java.util.InputMismatchException;
import java.util.Scanner;

import Account.AccountAdmin;
import Account.AccountUser;
import Account.AccountUserManager;
import Account.UserManager;
import Menu.AdminMenu;
import Menu.UserMenu;
import Vallidate.Validate;

public class Login {
    Scanner scanner = new Scanner(System.in);
    private final AdminMenu adminMenu = new AdminMenu();
    private final UserMenu userMenu = new UserMenu();
    private final AccountAdmin accountAdmin = new AccountAdmin();
    private final AccountUserManager accountUserManager = new AccountUserManager();
    private final UserManager userManager = new UserManager();

    public Login() {

    }

    public void loginSystems() {
        try {
            menuLogin();
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println();
            System.out.println("  !!!");
            System.out.println("--------------------");
            System.out.println();
            loginSystems();
        }
    }

    private void menuLogin() throws NumberFormatException {
        do {
            System.out.println("1.Log in");
            System.out.println("2.register account");
            System.out.println("0.Exit");
            System.out.println("Enter choice");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice < 0 || choice > 2) {
                System.out.println();
                System.out.println("Option does not exist, please re-enter");
                System.out.println("--------------------------");
            }
            switch (choice) {
                case 1:
                    loginManager();
                    break;
                case 2:
                    registerAccountUser();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        } while (true);
    }

    // đăng nhập
    private void loginManager() throws InputMismatchException {
        System.out.println("Log in");
        System.out.println("Enter user name");
        String account = scanner.nextLine();
        System.out.println("Enter pass word");
        String password = scanner.nextLine();
        checkAccount(account, password);
    }

    private void checkAccount(String account, String password) {
        try {
            if (checkLoginAccountAdmin(account, password)) {
                System.out.println();
                System.out.println("login By ADMIN successful ");
                System.out.println("-------------");
                System.out.println();
                AdminMenu.runByAdmin();
            } else {
                checkAccountUser(account, password);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("Login false, please re-Enter");
            System.out.println("------------------");
            System.out.println();
            loginSystems();
        }
    }

    private void checkAccountUser(String account, String password) {
        if (checkLoginAcountUser(account, password)) {
            System.out.println();
            System.out.println("Login User successful");
            System.out.println("---------------");
            System.out.println();
            UserMenu.RunByUser();
        } else {
            System.out.println();
            System.out.println("Option does not exist, please re-enter");
            System.out.println("----------------------------");
            System.out.println();
            loginSystems();
        }
    }

    private boolean checkLoginAccountAdmin(String account, String password) {
        for (AccountAdmin accountAdmin1 : accountAdmin.getAccountAdminList()) {
            boolean checkAccountAdmin = account.equals(accountAdmin1.getAdminAcc()) && password.equals(accountAdmin1.getAdminPass());
            if (checkAccountAdmin) {
                return true;
            }
        }
        return false;
    }

    private boolean checkLoginAcountUser(String account, String password) {
        for (AccountUser accountUser1 : accountUserManager.getAccountUserList()) {
            boolean checkAccountUser = account.equals(accountUser1.getAccount()) && password.equals(accountUser1.getPassword());
            if (checkAccountUser) {
                return true;

            }
        }
        return false;
    }

    // đăng kí
    private void registerAccountUser() throws InputMismatchException {
        System.out.println("-------register---------");
        System.out.println("Enter inFor");
        System.out.println("-----------------------");
        String accountUser = enterAccount();
        String passwordUser = enterPassword();
        System.out.println("----------Enter name----------");
        String name = scanner.nextLine();
        System.out.println("-----------Enter age-----------");
        int age = enterAge();
        System.out.println("-----------Enter address-----------");
        String address = scanner.nextLine();
        String phoneNumber = enterPhoneNumber();
        String email = enterEmail();
        checkAccountUser(accountUser, passwordUser, name, age, address, phoneNumber, email);

    }

    private int enterAge() {
        int age;
        while (true) {
            System.out.println("enter age");
            int inputAge = scanner.nextInt();
            boolean checkAge = (inputAge >= 10 && inputAge < 120);
            scanner.nextLine();
            if (!checkAge) {
                System.out.println("invalid age ");
            } else {
            age =inputAge;
            break;
            }
        }
        return age;
    }
    private String enterAccount(){
        String accountUser;
        while (true){
            System.out.println("Enter User name");
            String account= scanner.nextLine();
            if(!Validate.validateAccount(account)){
                System.out.println("User name invalid");
                System.out.println("[note]: user name account must have from 8 to 12 character");
            }else {
                accountUser = account;
                break;
            }
        }
        return  accountUser;
    }
    private String enterPassword() {
        String passwordUser;
        while (true) {
            System.out.print("Enter password ");
            String password = scanner.nextLine();
            if (!Validate.validatePassword(password)) {
                System.out.println("pass word invalid !!!");
                System.out.println(">[Chú ý]: password account must have from 8 to 12 character (a,A,1,...) and (@,#,$)");
                System.out.println("--------------------");
            } else {
                passwordUser = password;
                break;
            }
        }
        return passwordUser;
    }
    private String enterPhoneNumber() {
       String phoneNumber;
        while (true) {
            System.out.print("Enter number phone ");
            String phone = scanner.nextLine();
            if (!Validate.validatePhone(phone)) {
                System.out.println(" Number phone invalid !!!");
                System.out.println(">[note]: phone number must have 10 number  (0 - 9)");
                System.out.println("--------------------");
            } else {
                phoneNumber = phone;
                break;
            }
        }
        return phoneNumber;
    }
    private String enterEmail() {
        String email;
        while (true) {
            System.out.print("Enter email : ");
            String inputEmail = scanner.nextLine();
            if (!Validate.validateEmail(inputEmail)) {
                System.out.println(" Email invalid !!!");
                System.out.println(">[Chú ý]: Email must have the form: abc.company@yahoo.com/abc12.company@gmail.vn/...");
                System.out.println("--------------------");
            } else {
                email = inputEmail;
                break;
            }
        }
        return email;
    }
    private void checkAccountUser(String accountUser, String passwordUser, String name, int age, String address, String phoneNumber, String email) {
        if (checkAccount(accountUser)) {
            System.out.println();
            System.out.println(" Account already exist, please  registration again !!!");
            System.out.println("--------------------");
            System.out.println();
        } else {
            writeAccountUserAndUser(accountUser, passwordUser, name, age, address, phoneNumber, email);
            System.out.println();
            System.out.println("successful registration . please log in !!!");
            System.out.println("--------------------");
            System.out.println();
        }
        loginSystems();
    }
    private boolean checkAccount(String accountUser) {
        for (AccountUser accountUser2 : accountUserManager.getAccountUserList()) {
            boolean checkAccountUser = accountUser.equals(accountUser2.getAccount());
            if (checkAccountUser) {
                return true;
            }
        }
        return false;
    }

    private void writeAccountUserAndUser(String accountUser, String passwordUser, String name, int age, String address, String phoneNumber, String email) {
        accountUserManager.setListUser(accountUser, passwordUser);
        userManager.setListUser(accountUser, passwordUser, name, age, address, phoneNumber, email);
    }
}
