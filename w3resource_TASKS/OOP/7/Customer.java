package Online_OOP_Tasks_W3._7;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private int age;
    private static final int MAX_AGE = 123;
    private boolean hasAccount;
    private List <BankAccount> customerAccountsList;
    private boolean canWithdraw;

    public Customer(String name, int age, boolean hasAccount) {
        if (name.trim().length() > 1) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
        if (age >= 0 && age <= MAX_AGE) {
            this.age = age;
        } else {
            this.age = 0;
        }
        this.hasAccount = hasAccount;
        if (hasAccount) {
            customerAccountsList = new ArrayList<>();
        }
        if (hasAccount) {
            this.canWithdraw = this.age >= 18;
        } else {
            this.canWithdraw = false;
        }
    }

    void createNewAccount(BankAccount newAccount) {
        if (newAccount != null) {
            if (!hasAccount) {
                this.customerAccountsList = new ArrayList<>();
                this.customerAccountsList.add(newAccount);
                hasAccount = true;
            }
            else {
                this.customerAccountsList.add(newAccount);
            }
        }  else {
          newAccount = new BankAccount(this, Bank(" "), )
        }
    }

    void growUp () {
        if (this.age < MAX_AGE) {
            this.age++;
            System.out.println(this.name + " has grown and now is " + this.age + " years old.");
        } else {
            System.out.println(this.name + " is already at his maximum age and cannot get any older.");
        }
        if (this.age >= 18 && this.hasAccount) {
            canWithdraw = true;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isCanWithdraw() {
        return canWithdraw;
    }
}
