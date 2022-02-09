package com.hspedu.poly_.polyarr_;

public class PloyArray {
    // 2个学生类和2个老师类,1个person类，放在数组中，调用每个对象的say方法
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("you", 18,100);
        persons[2] = new Student("king", 20,156);
        persons[3] = new Teacher("pge", 20,20000);
        persons[4] = new Teacher("ack", 64,156444);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if(persons[i] instanceof Student){
//  判断person[i] 是否是学生类型。如果是就会返回true if条件执行
                Student student = (Student) persons[i];// 向下转型
                student.studying();
//              一条语句表达，((Student)person[i]).studying();
            }else if(persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teaching();
            }else if(persons[i] instanceof Person){
                continue;
            }else{
                System.out.println("类型有误。please again");
            }
        }
    }
}
