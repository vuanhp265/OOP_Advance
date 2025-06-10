package org.example.Bai4;

interface IBank {
    double getAmount();
}

interface ISavingAccount {
    void setSavingAmount(double amount);
}

interface ICreditAccount {
    void creditAmount(double amount);
}

class SavingAccount implements IBank, ISavingAccount {
    private double balance;

    public void setSavingAmount(double amount) {
        balance += amount;
        System.out.println("Saving: + " + amount);
    }

    public double getAmount() {
        return balance;
    }
}

class CreditAccount implements IBank, ICreditAccount {
    private double balance;

    public void creditAmount(double amount) {
        balance -= amount;
        System.out.println("Credit: - " + amount);
    }

    public double getAmount() {
        return balance;
    }
}

// Main
public class Main4 {
    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount();
        saving.setSavingAmount(1000);
        saving.setSavingAmount(500);
        System.out.println("Saving Account Balance: " + saving.getAmount());

        CreditAccount credit = new CreditAccount();
        credit.creditAmount(200);
        credit.creditAmount(150);
        System.out.println("Credit Account Balance: " + credit.getAmount());
    }
}
