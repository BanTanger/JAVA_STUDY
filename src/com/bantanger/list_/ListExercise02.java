package com.bantanger.list_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("六个核桃",164,"凄凄切切"));
        list.add(new Book("三国转",54,"妃子"));
        list.add(new Book("桃花园及",14,"盗神"));
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book i = (Book) o1;
                Book j = (Book) o2;
                return i.getPrice() - j.getPrice();
            }
        });
        for (Object o : list) {
            System.out.println(o);
         }

    }
}
class Book{
    private String name;
    private int price;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称:" + getName() +"\t" +
                "价格:" + getPrice() + "\t" +
                "作者:" + getAuthor();
    }
}