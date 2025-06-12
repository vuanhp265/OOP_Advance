package org.example.Bai4;

public class SavingAccount implements IBank, ISavingAccount {
    private double balance;

    public void setSavingAmount(double amount) {
        balance += amount;
        System.out.println("Saving: + " + amount);
    }

    public double getAmount() {
        return balance;
    }
}
