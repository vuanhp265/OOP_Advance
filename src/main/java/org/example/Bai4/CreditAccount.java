package org.example.Bai4;

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
