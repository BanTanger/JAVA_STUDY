package com.hspedu.encupsulation;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("王明");
        account.setBalance(123456);
        account.setPwd("123456");

        account.showInfo();
    }
}
