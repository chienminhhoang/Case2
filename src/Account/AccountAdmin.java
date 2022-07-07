package Account;

import java.io.Serializable;
import java.util.ArrayList;

public class AccountAdmin implements Serializable {
    private String adminAcc;
    private String adminPass;
    private final ArrayList<AccountAdmin>accountAdminList= new ArrayList<>();

    public AccountAdmin(String adminAcc,String adminPass){
        this.adminAcc = adminAcc;
        this.adminPass = adminPass;
    }
    public  AccountAdmin(){
        accountAdminList.add(new AccountAdmin("admin","123123"));

    }

    public String getAdminAcc() {
        return adminAcc;
    }

    public void setAdminAcc(String adminAcc) {
        this.adminAcc = adminAcc;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public ArrayList<AccountAdmin> getAccountAdminList() {
        return accountAdminList;
    }

    @Override
    public String toString() {
        return "AccountAdmin{" +
                "adminAcc='" + adminAcc + '\'' +
                ", adminPass='" + adminPass + '\'' +
                ", accountAdminList=" + accountAdminList +
                '}';
    }
}
