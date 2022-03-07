package com.bantanger.thread_;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);

        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            Thread.sleep(1000);
            if (i == 5) {
                thread.start();
                thread.join();
            }
            if (i== 10){
                System.out.println("主线程进程结束");
            }
        }
    }
}
class Dog implements Runnable{
    private int i = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("hello " + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 10){
                System.out.println("子线程进程结束");
                break;
            }
        }
    }
}
