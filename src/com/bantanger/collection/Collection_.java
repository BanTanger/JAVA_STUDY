package com.bantanger.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演绎",10.1,"罗贯中"));
        col.add(new Book("小李飞刀",5.1,"古龙"));
        col.add(new Book("红楼梦",34.6,"曹雪清"));

        // while 循环方式 快捷键是itit
        // 先创建一个迭代器
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("book=" + next);
        }
        System.out.println("==================");
        // For 增强for循环方式 快捷键 I
        for (Object book : col){
            System.out.println("book=" + book);
        }

    }
}
class Book{
    private String name;
    private double price;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
