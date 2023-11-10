package at.eee.examples.bank;

public class Bank {
    private String name;
    private int id;
    private SavingsAccount savingsAccount;
    private CheckingsAccount checkingsAccount;
    private CreditAccount creditAccount;

    public Bank(String name, int id, SavingsAccount savingsAccount, CheckingsAccount checkingsAccount, CreditAccount creditAccount) {
        this.name = name;
        this.id = id;
        this.savingsAccount = savingsAccount;
        this.checkingsAccount = checkingsAccount;
        this.creditAccount = creditAccount;
    }
    //Fuktionen
    public void payout(String a, double betrag){
        switch(a) {
            case "savingsAccount":
                double savingsAccountValue = getSavingsAccount().getValue();
                double x = savingsAccountValue - betrag;
                if (x >= 0){
                    System.out.println("Du hast " + betrag + " abgebucht");
                    getSavingsAccount().setValue(x);
                }else {
                    System.out.println("Du hast zu wenig Geld");
                }
                break;
            case "checkingsAccount":
                double checkingsAccountValue = getCheckingsAccount().getValue();
                double checkingsAccountLimit = getCheckingsAccount().getLimit();
                x = checkingsAccountValue - betrag;
                if (x > checkingsAccountLimit){
                    System.out.println("Du hast " + betrag + " abgebucht");
                    getCheckingsAccount().setValue(x);
                } else {
                    System.out.println("Du hast zu wenig Geld");
                }
                break;
            case "creditAccount":
                double creditAccount = getCreditAccount().getValue();
                break;
            default:
                System.out.println("Geben Sie ein gültiges Konto an");
        }
    }

    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public CheckingsAccount getCheckingsAccount() {
        return checkingsAccount;
    }

    public void setCheckingsAccount(CheckingsAccount checkingsAccount) {
        this.checkingsAccount = checkingsAccount;
    }

    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }
}
