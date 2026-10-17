public class SavingsAccountPasco extends BankAccountPasco {
    private int accountNo;
    private double balance;
    private double interestRate;
    // Default Constructor
    public SavingsAccountPasco() {
        accountNo = 0;
        balance = 0;
        interestRate = 0.05;
    }
    // Parameterized Constructor
    public SavingsAccountPasco(int accountNo,
                               double balance,
                               double interestRate,
                               String accountName,
                               String address,
                               String birthday,
                               String contactNumber) {
        super(accountName, address, birthday, contactNumber);
        this.accountNo = accountNo;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void balanceInquiry() {
    System.out.println("Account Number : " + accountNo);
    System.out.println("Balance        : " + balance);
}
    public void deposit(double amount) {
    if (amount >= 100) {
        balance += amount;
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Deposit Successful!");
        System.out.println("Interest Added : " + interest);
        System.out.println("New Balance    : " + balance);
    } else {
        System.out.println("Minimum deposit is 100.");
    }
}
    public void withdraw(double amount) {
    if (amount < 100) {
        System.out.println("Minimum withdrawal is 100.");
        return;
    }
    if ((balance - amount) >= 5000) {
        balance -= amount;
        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance : " + balance);
    } else {
        System.out.println("Withdrawal denied.");
        System.out.println("Maintaining balance is 5000.");
    }
}
    public boolean validateAcctNumber(int acctNo) {
    return accountNo == acctNo;
}
    public void closeAccount() {
    balance = 0;
    System.out.println("Account Closed.");
}
}