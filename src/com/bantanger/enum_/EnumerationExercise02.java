package com.bantanger.enum_;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class EnumerationExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        System.out.println("=================");
        for (Week i : values){
            System.out.println(i);
        }
        System.out.println("=================");

    }
}
enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
}
