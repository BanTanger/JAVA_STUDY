package com.bantanger.chapter14_homework.Homework01;

import java.util.ArrayList;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊病例超过千万，数百万印度教信徒赴恒河圣浴引民众堪忧"));
        arrayList.add(new News("男子突然象棋2个月前钓的鱼还在往网兜里，捞起来一看赶紧放生"));
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            News news = (News)arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));

        }

    }
    public static String processTitle(String title){
        if(title == null){
            return "";
        }

        if (title.length()>15){
            return title.substring(0,15) + "...";
        }else{
            return title;
        }
    }
}

class News {
    private String title;
    private String content;

    @Override
    public String toString() {
        return  "\n" + title ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(String title) {
        this.title = title;
    }
}
