public class Cimb {

    public static void main(String[] args) {
        BankAccount account = (BankAccount) new SavingsAccount();

        account.setAccountNumber(1234);
        account.setAccountName("Juan Dela Cruz");
        account.setBalance(10000.0);

        System.out.println(account.showInfo());
        System.out.println("Account type: " + account.showAccountType());
        System.out.println("Interest rate: " + account.getInterestRate());
        System.out.println("New balance: " + account.computeBalanceWithInterest());
        System.out.println("Benefits: " + account.showBenefits());

        System.out.println("----------------------");

        BankAccount gSave = new GSave(account, 1234, "Juan Dela Cruz", 10000.0);
        System.out.println(gSave.showInfo());
        System.out.println("New balance: " + gSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + gSave.showBenefits());

        System.out.println("----------------------");

        BankAccount upSave = new UpSave(account, 1234, "Juan Dela Cruz", 10000.0);
        System.out.println(upSave.showInfo());
        System.out.println("New balance: " + upSave.computeBalanceWithInterest());
        System.out.println("Benefits: " + upSave.showBenefits());
    }
}