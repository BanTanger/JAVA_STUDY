package com.bantanger.innerclass_;

public class AnonymousInnerClassExercise01 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了");
            }
        });
    }
}
interface Bell{
    public void ring();
}
class Cellphone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}