public interface BankAccount {
    void setAccountNumber(int accountNumber);
    void setAccountName(String accountName);
    void setBalance(double balance);

    String showAccountType();
    double getInterestRate();
    double getBalance();
    String showBenefits();
    double computeBalanceWithInterest();
    String showInfo();
}