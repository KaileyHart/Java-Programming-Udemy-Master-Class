public class Constructors {

    public static void main(String[] args) {
        
        BankAccount myAccount = new BankAccount("123456789", 100.0, "Kailey Hart", "kaileyhart@email.com", "(260) 317-3453");
        myAccount.withdrawal(100.50);
        myAccount.deposit(51);
        myAccount.withdrawal(50);

    };
    
};
