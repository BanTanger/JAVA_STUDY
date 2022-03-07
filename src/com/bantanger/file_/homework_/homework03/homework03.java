package com.bantanger.file_.homework_.homework03;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author bantanger 半糖
 * @version 1.0
 * <p>
 * 要求
 * 编写dog.properties
 * name = tom
 * age = 5
 * color = red
 * 编写Dog类（name，age，color）创建一个dog对象，
 * 读取dog.properties的相应内容完成属性初始化
 * 将创建的Dog对象，序列化到文件dog.dat文件
 */
public class homework03 {
    public static void main(String[] args) {
        // 编写配置文件properties
        String filePath = "E:\\Java 学习项目集合\\Java_Test_Try" +
                "\\src\\dog.properties";
        Properties properties = new Properties();
        // 设置键值k-v
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "red");
        // 保存键值
        try {
            properties.store(new FileWriter(filePath), null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 创建dog对象

        // 读取配置文件 load
        try {
            properties.load(new FileReader(filePath));

            // 读取键值 列表获取所有键值
            //properties.list(System.out);

            // 读取每一个键值
            String name = properties.getProperty("name");
            int age = Integer.parseInt(properties.getProperty("age"));
            String color = properties.getProperty("color");
            //System.out.println("name " + name + " age " + age + " color " + color);
            Dog dog = new Dog(name,age,color);
            Dog dog1 = new Dog("笑话", 5, "白");
            System.out.println(dog1);
            System.out.println(dog);

            // 序列化
            String serFilePath = "e:\\dog.dat";
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
            oos.writeObject(dog);
            //oos.writeObject(dog1);
            // 实现序列化子类要实现序列化接口
            // 一定要关闭流
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void Deserialize() throws IOException, ClassNotFoundException {
        // 反序列化不能操作append状态的数据，应该要处理好append里的换行操作
        String serFilePath = "e:\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
//        Object o = ois.readObject(); 错误，需要强制转换成dog类
        Dog dog = (Dog) ois.readObject();
        System.out.println("====反序列化后====");
        System.out.println(dog);
        ois.close();
    }
}

class Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}