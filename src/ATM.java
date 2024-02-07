class ATM {
    private Bank bank;
    private String identifier;
    private int number;

    public ATM(Bank bank, String identifier, int number) {
        this.bank = bank;
        this.identifier = identifier;
        this.number = number;
    }

    public Bank getBank() {
        return bank;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getNumber() {
        return number;
    }

    public void withdrawMoneyFromAccount(int pinCode, double amount) {
        for (Account account : bank.getAccounts()) {
            if (account.getAccountNumber() == pinCode) {
                account.withdrawFromAccount(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }
}
