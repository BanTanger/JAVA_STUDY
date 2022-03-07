package com.bantanger.thread_;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();

        System.out.println("主线程继续运行" + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 i = " + i);
            Thread.sleep(1000);
        }
    }
}
class Cat extends Thread{
    int i = 0;
    @Override
    public void run() {
        while(true){
            // 该线程每隔一秒在控制台输出
            System.out.println( ++i + " 木头人" + " 子线程名字" + Thread.currentThread().getName());
            // 休眠 1000 ms，执行之后会抛出异常，所以需要catch
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if ( i == 80){
                break;
            }
        }
    }
}
