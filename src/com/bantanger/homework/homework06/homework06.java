package com.bantanger.homework.homework06;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class homework06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Horse());
        // 渡河
        person.PassRiver();
        // 一般情况
        person.Common();
    }
}
interface Vehicles{
   void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("使用马作为交通工具");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("使用船作为交通工具");
    }
}
class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void PassRiver(){
        if(!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void Common(){
        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
}
class VehiclesFactory {
    //马儿始终是同一匹
    private static Horse horse = new Horse(); //饿汉式

    private VehiclesFactory(){}
    //创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
    //这里，我们将方法做成static
    public static Horse getHorse() {
//        return new Horse();
        return horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
}