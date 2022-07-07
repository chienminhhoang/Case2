package Account;

import HandleFile.FileIO;

import java.io.File;
import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> userList;
    private final FileIO<User> fileIO = new FileIO();
    private final String PATHNAME_OF_USER = "FileData/userinfor";

    public UserManager() {
        if (new File(PATHNAME_OF_USER).length() == 0) {
            this.userList = new ArrayList<>();
        } else {
            this.userList = fileIO.readDataFromFile(PATHNAME_OF_USER);
        }
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void displayUserList() {
        userList = fileIO.readDataFromFile(PATHNAME_OF_USER);
        if (userList.isEmpty()) {
            System.out.println("users Haven't sign up yet ");
        } else {
            System.out.println("----------------------------------------------------------------------");
            System.out.printf("| %-15s| %-15s| %-15s| %-15s |\n", "Tên", "Tài khoản", "Tuổi", "Số điện thoại");
            System.out.println("----------------------------------------------------------------------");
            for (User user : userList) {
                System.out.printf("| %-15s| %-15s| %-15d| %-15s |\n", user.getName(), user.getAccount(), user.getAge(), user.getPhoneNumber());
                System.out.println("----------------------------------------------------------------------");
            }
        }

    }

    public void displayAll() {
        userList.forEach(System.out::println);
    }

    public void deleteByName(String account) {
        User user = null;
        for (User user1 : userList) {
            if (user1.getAccount().equals(account)) {
                user = user1;
            }
        }
        if (user != null) {
            userList.remove(user);
            fileIO.writeDataToFile(userList, PATHNAME_OF_USER);
            System.out.println("Xóa tài khoản " + account + " thành công !!!");
            System.out.println("--------------------");
        } else {
            System.out.println("Không tìm thấy tài khoản cần xóa");
            System.out.println("--------------------");
        }
    }

    public void setListUser(String accountUser, String passwordUser, String name, int age, String address, String phoneNumber, String email) {
        userList.add(new User(accountUser, passwordUser, name, age, address, phoneNumber, email));
        fileIO.writeDataToFile(userList, PATHNAME_OF_USER);
    }
}
