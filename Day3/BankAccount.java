class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int acc, double bal) {
        super(acc, bal);
    }

    void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int acc, double bal) {
        super(acc, bal);
    }

    void withdraw(double amount) {
        super.withdraw(amount);
    }
}

public class BAnkAccount {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, 5000);
        s.withdraw(1000);
        System.out.println("Balance: " + s.getBalance());
    }
}