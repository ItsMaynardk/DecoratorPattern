public class GSave implements BankAccountDecorator {
    private BankAccount account;

    public GSave(BankAccount account, int gSaveAccountNumber, String gSaveAccountName, double gSaveBalance) {
        this.account = account;
        this.account.setAccountNumber(gSaveAccountNumber);
        this.account.setAccountName(gSaveAccountName);
        this.account.setBalance(gSaveBalance);
    }

    @Override
    public void setAccountNumber(int accountNumber) {

    }

    @Override
    public void setAccountName(String accountName) {

    }

    @Override
    public void setBalance(double balance) {

    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025;
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + ", GCash Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.computeBalanceWithInterest();
    }

    @Override
    public String showInfo() {
        return account.showInfo() + "\nAccount type: " + showAccountType() + "\nInterest rate: " + getInterestRate();
    }
}