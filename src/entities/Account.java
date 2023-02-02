package entities;

public class Account {
    private int numberAccount;
    private String name;
    private double balance;


    public Account(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }
    public Account(int numberAccount, String name, double deposit ) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = deposit;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void makeDeposit(double deposit) {
        this.balance += deposit;
    }

    public void makeWithdraw(double withdraw) {
        this.balance = balance - withdraw - 5 ;
    }

    public String toString() {
        return "Account "
                + getNumberAccount()
                + ", Holder: "
                + getName()
                + ", Balance: $ "
                + String.format("%.2f", getBalance());
    }
}
