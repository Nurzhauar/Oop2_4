public class AutomatedATM {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");

        Account account1 = new Account(bank, 68447, 2500.0);
        Account account2 = new Account(bank, 13256, 750.0);

        ATM atm1 = new ATM(bank, "ATM001", 707);
        ATM atm2 = new ATM(bank, "ATM002", 666);
        ATM atm3 = new ATM(bank, "ATM003", 101);

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.addATM(atm1);
        bank.addATM(atm2);
        bank.addATM(atm3);

        System.out.println("Account information:");
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());

        double amountToWithdraw = 300.0;
        System.out.println("\nWithdrawing " + amountToWithdraw + " from account...");
        account1.withdrawFromAccount(amountToWithdraw);

        System.out.println("\nUpdated Account information:");
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());

        System.out.println("\nTesting ATM withdraw method:");
        atm1.withdrawMoneyFromAccount(75757, 400.0);
        System.out.println("\nUpdated Account information after ATM withdrawal:");
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());
    }
}