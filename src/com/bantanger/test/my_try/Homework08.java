package com.bantanger.test.my_try;

public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);
//        checkingAccount.deposit(10);
//        checkingAccount.deposit(10);
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance()); // 1300 免手续费
        savingsAccount.withdraw(9);
        System.out.println(savingsAccount.getBalance()); // 1300 - 9 - 1 三次免手续费结束

        // 月初 ，定时器自动调用 earnMonthlyInterest
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance()); // 1290 + 12.90
        savingsAccount.withdraw(15); // 1302 - 15 免手续费
    }
}
class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    // 存款
    public void deposit(double amount){
        balance += amount;
    }
    // 取款
    public void withdraw(double amount){
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
class CheckingAccount extends BankAccount{
    double handling_fee = 1;

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - handling_fee);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
class SavingsAccount extends BankAccount{
    private int count = 3;
    private double rate = 0.01;
    public SavingsAccount(int balance) {
        super(balance);
    }

    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * rate);
    }

    @Override
    public void deposit(double amount) {
        if(count > 0) {
            super.deposit(amount);
        }else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if(count > 0){
            super.withdraw(amount);
        }else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }




}