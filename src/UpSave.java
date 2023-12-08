public class UpSave implements BankAccountDecorator{
    private BankAccount account;

    public UpSave(BankAccount account, int upSaveAccountNumber, String upSaveAccountName, double upSaveBalance) {
        this.account = account;
        this.account.setAccountNumber(upSaveAccountNumber);
        this.account.setAccountName(upSaveAccountName);
        this.account.setBalance(upSaveBalance);
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
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + ", With Insurance";
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