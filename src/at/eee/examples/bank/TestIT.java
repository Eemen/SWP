package at.eee.examples.bank;

public class TestIT {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1, 100);
        CheckingsAccount checkingsAccount = new CheckingsAccount(1, 100, -100);
        CreditAccount creditAccount = new CreditAccount(1, -100, -1000);

        Bank bank = new Bank("Egemen", 1, savingsAccount, checkingsAccount, creditAccount);

        bank.payout("savingsAccount", 30);
        bank.payout("savingsAccount", 80);

        bank.payout("checkingsAccount", 180);
        bank.payout("checkingsAccount", 30);

        bank.payout("creditAccount", 500);
        bank.payout("creditAccount", 500);

        bank.payin("savingsAccount", 100);

        bank.payin("checkingsAccount", 300);

        bank.payin("creditAccount", 30);
        bank.payin("creditAccount", 1000);

        bank.getSaldo("savingsAccount");
        bank.getSaldo("checkingsAccount");
        bank.getSaldo("creditAccount");
    }
}
