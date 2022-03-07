package com.bantanger.test.my_try.Homework13;

public class test {
    public static void main(String[] args) {
        // 向上转型
        Person[] people = new Person[4];
        people[0] = new Student("小王","男",20,1909012343);
        people[1] = new Student("小李","男",19,1909012344);
        people[2] = new Teacher("李迷航","男",64,14);
        people[3] = new Teacher("李正航","男",34,10);
        Person tmp = null;
        for (int i = 0; i   < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if(people[j].getAge() < people[j+1].getAge()){
                    tmp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
            if (people[i] instanceof Teacher){
                System.out.println(((Teacher) people[i]).teach());
                System.out.println("------------------------------");
            }
            if (people[i] instanceof Student){
                System.out.println(((Student) people[i]).study());
                System.out.println("------------------------------");
            }
        }
    }
}
