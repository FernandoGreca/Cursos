package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;


    public Account() {
    }
    public Account(int number, String holder, double deposit) {
        this.number = number;
        this.holder = holder;
        this.balance = deposit;
    }
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }


    public int getNumber() {
        return number;
    }
    public String getHolder() {
        return holder;
    }
    public double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    
    public void deposit(double deposit) {
        this.balance += deposit;
    }
    public void withdraw(double withdraw) {
        this.balance += - 5 - withdraw;
    }


    @Override
    public String toString() {
        return "Account " 
                + number 
                + ", Holder: " 
                + holder 
                + ", Balance: $ " 
                + String.format("%.2f", balance);
    }

    

    

}
