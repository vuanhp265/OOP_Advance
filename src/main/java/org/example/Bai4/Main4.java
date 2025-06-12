package org.example.Bai4;

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
