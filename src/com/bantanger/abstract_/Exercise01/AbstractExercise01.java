package com.bantanger.abstract_.Exercise01;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 13456, 20000, 5000);
        CommonEmployee kobn = new CommonEmployee("kobn", 15475, 12000);
        jack.work();
        kobn.work();
    }

}
