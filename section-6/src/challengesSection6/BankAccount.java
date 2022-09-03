public class BankAccount {

    // * Initialize Variables
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // * Constructor
    public BankAccount() {

        // * You *can* have a default constructor in case parameters are not provided, but this is not required
        this("0", 0.0, "First Last", "email@email.com", "(xxx) xxx-xxxx");
        System.out.println("Empty constructor");

    };

    // * NOTE: You can have as many constructors as you want with a mix between set and default constructors

    public BankAccount(String accountNumber, Double accountBalance, String customerName, String customerEmail, String customerPhone ) {

        // * NOTE: Don"'t call getters & setters inside of a constructor. A setter such as "setAccountNumber()" is NOT guaranteed to run properly. Setting them similar to down below guarantees the that the value is set properly.  

        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;

    };


    // * Getters
    public String getAccountNumber() {
        return this.accountNumber;
    };

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    };

    public double getAccountBalance() {
        return this.accountBalance;
    };

    // * Setters
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    };

    public String getCustomerName() {
        return this.customerName;
    };

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    };

    public String getCustomerEmail() {
        return this.customerEmail;
    };

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    };

    public String getCustomerPhone() {
        return this.customerPhone;
    };

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    };


    // * Class Methods

    public void deposit(double depositAmount) {

        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed. New balance: " + this.accountBalance); 

    };

    public void withdrawal(double withdrawalAmount) {

        if (this.accountBalance - withdrawalAmount < 0) {

            System.out.println("Only " + this.accountBalance + " available. Withdrawal not processed.");

        } else {

            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. New balance: " + this.accountBalance); 
            
        };

    };
    
};
