package BankSystem;

public class Customer {
    public static void main(String[] args) {
        BankAccount Ba=new BankAccount("XXX119390490325809","Somnath barik");
        Ba.Deposit(100000);
        System.out.println(Ba.Withdraw(50000));
        System.out.println(Ba.Withdraw(50000));
        System.out.println(Ba.Withdraw(-50000));

    }
}
