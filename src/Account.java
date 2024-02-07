class Account {
    private Bank bank;
    private int accountNumber;
    private double balance;

    public Account(Bank bank, int accountNumber, double balance) {
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void replenishAccount(double amount) {
        balance += amount;
    }

    public void withdrawFromAccount(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
