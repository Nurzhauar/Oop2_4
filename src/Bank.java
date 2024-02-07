import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Account> accounts;
    private ArrayList<ATM> ATMs;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
        this.ATMs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public ArrayList<ATM> getATMs() {
        return ATMs;
    }

    public void addATM(ATM atm) {
        ATMs.add(atm);
    }
}
