package Encapsulation;

public class EncapsulationBank {
    private String accountNumber;
    private double balance;

    public EncapsulationBank(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Main4 {
    public static void main(String[] args) {
       EncapsulationBank account = new EncapsulationBank("1234567890", 1000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: Rs " + account.getBalance());

        account.deposit(500);
        System.out.println("Updated Balance: Rs " + account.getBalance());

        account.withdraw(200);
        System.out.println("Updated Balance: Rs " + account.getBalance());

        account.withdraw(1500);
    }
}
