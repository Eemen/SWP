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
                double creditAccountValue = getCreditAccount().getValue();
                double creditAccountLimit = getCreditAccount().getLimit();
                x = creditAccountValue - betrag;
                if (x > creditAccountLimit){
                    System.out.println("Du hast " + betrag + " mehr Kredit abgehoben");
                    getCreditAccount().setValue(x);
                }else {
                    System.out.println("Das würde dein Limit überstreiten");
                }


                break;
            default:
                System.out.println("Geben Sie ein gültiges Konto an");
        }
    }

    public void payin(String a, double betrag){
        switch (a){
            case "savingsAccount":
                double x = getSavingsAccount().getValue() + betrag;
                System.out.println("Sie haben: " + betrag + " eingezahlt");
                getSavingsAccount().setValue(x);
                break;
            case "checkingsAccount":
                x = getCheckingsAccount().getValue() + betrag;
                System.out.println("Sie haben: " + betrag + " eingezahlt");
                getCheckingsAccount().setValue(x);
                break;
            case "creditAccount":
                x = getCreditAccount().getValue() + betrag;
                if (x < 0){
                    System.out.println("Sie haben " + betrag + " eingezahlt");
                    getCreditAccount().setValue(x);
                }else {
                    System.out.println("Sie können nicht so viel Geld Einzahlen, da sie nicht so viele Schulden haben");
                }
                break;
        }
    }

    public void getSaldo(String a){
        switch (a){
            case "savingsAccount":
                System.out.println("Sie haben " + getSavingsAccount().getValue() + " auf dem Konto");
                break;
            case "checkingsAccount":
                System.out.println("Sie haben " + getCheckingsAccount().getValue() + " auf dem Konto");
                break;
            case "creditAccount":
                System.out.println("Sie haben " + getCreditAccount().getValue() + " auf dem Konto");
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
