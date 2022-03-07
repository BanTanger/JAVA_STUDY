package com.bantanger.homework.homework07;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class homework07 {
    public static void main(String[] args) {
        Car car = new Car(13);
        Car car01 = new Car(-2);
        Car car02 = new Car(45);
        car.new Air().flow();
        car01.new Air().flow();
        car02.new Air().flow();
    }
}
class Car{
    private int temperature;
    public class Air{
        public void flow(){
            if(temperature>40){
                System.out.println(" 冷气 ");
            }else if (temperature < 0){
                System.out.println(" 暖气 ");
            }else{
                System.out.println(" 关掉空调 ");
            }
        }
    }

    public Car(int temperature) {
        this.temperature = temperature;
    }
    // TODO: 2022/2/13

    @Override
    public String toString() {
        return "Car{" +
                "temperature=" + temperature +
                '}';
    }
}