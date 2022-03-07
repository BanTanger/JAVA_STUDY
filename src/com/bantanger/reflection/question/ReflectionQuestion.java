package com.bantanger.reflection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties")); // 加载类
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        /*System.out.println(classfullpath);
        System.out.println(method);*/

        // 使用反射机制
        Class cls = Class.forName(classfullpath);
        // com.bantanger.Cat的对象实例
        Object o = cls.newInstance(); // 通过cls.newInstance() 方式得到加载出来的类

        // 通过methodName的方法得到加载出来类的方法，起变量名为method
        Method method = cls.getMethod(methodName);
        System.out.println(method);
        System.out.println("====================");
        // 通过method.invoke的方式得到在配置文件中的类
        method.invoke(o); // 反射机制 方法.invoke(对象)

        // getField 获得属性，但不能获得私有属性
        Field name = cls.getField("name");
        System.out.println(name.get(o)); // 传统写法 对象.成员变量， 反射: 成员变量对象.get(对象)

        // getConstructor
        Constructor constructor = cls.getConstructor(); // ()中可以指定构造器参数类型，默认返回无参构造器
        System.out.println(constructor);

        Constructor constructor1 = cls.getConstructor(String.class); // 需要什么参数，就把参数对应类型传入，后面带一个.class的后缀
        System.out.println(constructor1);

        Constructor constructor2 = cls.getConstructor(String.class, int.class);
        System.out.println(constructor2);
    }
}
