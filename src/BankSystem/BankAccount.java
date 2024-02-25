package BankSystem;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double Balance;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void Deposit(double Balance){
        if (Balance<=0){
            System.out.println("Invalid Amount");
        }
        this.Balance+=Balance;
    }
    public double Withdraw(double Balance){
        if (Balance<=0){
            System.out.println("Invalid Amount");
            return 0;
        }else if(Balance>this.Balance){
            System.out.println("Your account hav not safficiant value");
            return 0;
        } else {
            this.Balance-=Balance;
        }
     return Balance;
    }

}
