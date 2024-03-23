package pack;

public class Bank
{
    int a =22;
    long phone =90908886666666l;
    double balance=23232.99;
    public void transferAmount(double amount)
    {
        balance=balance-amount;
        System.out.println(balance);
    }
    public static void main(String[] args)
    {
       Bank bank = new Bank();
       bank.transferAmount(1777);
       System.out.println(bank.a);
        System.out.println(bank.phone);
        System.out.println(bank.balance);
    }
}
