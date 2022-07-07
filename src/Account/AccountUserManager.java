package Account;

import java.util.ArrayList;
import java.io.File;
import HandleFile.FileIO;

public class AccountUserManager {
    private final ArrayList<AccountUser> accountUserList;
    private final FileIO<AccountUser> ioFile = new FileIO();
    private final String PATHNAME_OF_ACCOUNT_USER="FileData/accountuser";
    public AccountUserManager(){
        if (new File(PATHNAME_OF_ACCOUNT_USER).length() == 0) {
            this.accountUserList = new ArrayList<>();
        } else {
            this.accountUserList = ioFile.readDataFromFile(PATHNAME_OF_ACCOUNT_USER);
        }
    }
    public ArrayList<AccountUser> getAccountUserList() {
        return accountUserList;
    }

    public void setListUser(String account, String password) {
        accountUserList.add(new AccountUser(account, password));
        ioFile.writeDataToFile(accountUserList, PATHNAME_OF_ACCOUNT_USER);
    }
}
