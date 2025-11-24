package extrainterface4;

public interface Account {

    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();
}

class SavingsAccount implements Account {

    private double balance, interestRate;

    public SavingsAccount(double balance, double rate) {
        this.balance = balance;
        this.interestRate = rate;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }

    public void applyInterest() {
        balance += balance * interestRate / 100;
    }
}

class CurrentAccount implements Account {

    private double balance, overdraftLimit;

    public CurrentAccount(double balance, double overdraft) {
        this.balance = balance;
        this.overdraftLimit = overdraft;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (balance + overdraftLimit >= amt) {
            balance -= amt;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Bank {

    private Account acc1, acc2;

    public void setAccounts(Account a1, Account a2) {
        acc1 = a1;
        acc2 = a2;
    }

    public void deposit(Account a, double amt) {
        a.deposit(amt);
    }

    public void withdraw(Account a, double amt) {
        a.withdraw(amt);
    }

    public void printBalances() {
        System.out.println("Balance 1: " + acc1.getBalance());
        System.out.println("Balance 2: " + acc2.getBalance());
    }
}

class Main {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000, 1.25);
        CurrentAccount ca = new CurrentAccount(5000, 1000);

        Bank bank = new Bank();
        bank.setAccounts(sa, ca);

        bank.deposit(sa, 100);
        bank.deposit(ca, 500);

        bank.withdraw(sa, 150);

        System.out.println("Balances before interest:");
        bank.printBalances();

        sa.applyInterest();

        System.out.println("\nBalances after applying interest:");
        bank.printBalances();
    }
}
