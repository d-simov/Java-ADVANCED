package Online_OOP_Tasks_W3._7;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String bankName;
    private List<BankAccount> bankAccountList;

    public Bank(String bankName) {
        if (bankName.trim().length() > 1) {
            this.bankName = bankName;
        }
        else {
            this.bankName = "Central Bank";
        }
        this.bankAccountList = new ArrayList<BankAccount>();
    }

    void addAccount (BankAccount newAccount) {
        if (newAccount != null) {
            bankAccountList.add(newAccount);
        }
    }

    void removeAccount (BankAccount bankAccount) {
        if (bankAccountList.contains(bankAccount)) {
            bankAccountList.remove(bankAccount);
        }
    }
}
