package Online_OOP_Tasks_W3._7;

public class BankAccount {

    Customer accountOwner;
    Bank bank;
    double accountAmount;

    BankAccount (Customer accountOwner, Bank bank, double initialAccountAmount) {
        if (accountOwner != null) {
            this.accountOwner = accountOwner;
        }
        if (bank != null) {
            this.bank = bank;
        }
        if (initialAccountAmount > 0) {
            this.accountAmount = initialAccountAmount;
        }
        else {
            this.accountAmount = 10;
        }
        System.out.println(this.accountOwner.);
    }

}
