package com.bantanger.thread_.synchronized_;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class Homework {
    public static void main(String[] args) {
        Withdrawal withdrawal = new Withdrawal();
        new Thread(withdrawal).start();
        new Thread(withdrawal).start();
    }
}

class Withdrawal implements Runnable {
    private static int money = 10000;
    private static boolean flag = true;

    public static void Drawal() {
        synchronized (Withdrawal.class) {
             System.out.println("用户 " + Thread.currentThread().getName()
                    + " 取走1000元" + " 当前余额 " + (money -= 1000));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (money <= 0) {
            flag = false;
        }

    }

    @Override
    public void run() {
        while (flag) {
            Drawal();
        }
    }
}
