package com.bantanger.houserent.service;

import com.bantanger.houserent.domain.House;

/**
 * HouseService.java<=>类 [业务层]
 * 定义House[] ,保存House对象
 * 1. 响应HouseView的调用
 * 2. 完成对房屋信息的各种操作(增删改查c[create]r[read]u[update]d[delete])
 */
public class HouseService {
    private House houses[];// 创建一个房屋列表 类型是 House
    private int houseNum = 1;// 记录当前有多少个房屋信息
    private int idCounter = 1; //记录当前id为多少
    //创建一个构造器来存放数组大小 Size
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"jack","1362004","广东东莞",2000,"未出租");
    }
    // find 方法 查找房屋信息
    public House find(int findId) {
        // 先找到要查找的id
        for (int i = 0; i < houseNum; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
    // del 方法 删除房屋信息
    public boolean del(int delId){
        if(houseNum == 0){
            System.out.println("=========无数据可删除=========");
            return false;
        }
        // 找到要删除的下标
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()){ // 要删除的房屋id是数组下标为i的元素
                index = i;// index记录i
            }
        }
        if (index == -1){ // delId在数组中不存在
            return false;
        }
        for (int i = 0; i < houseNum - 1; i++) {
            houses[i] = houses[i+1];
        }
        // 因为已经移动数组，已有房屋信息最后会有两个一模一样的，所以要把最后一个设置成空null
        houses[--houseNum] = null;
        return true;
    }
    // list 方法 来返回列表
    public House[] list() {
        return houses;
    }
    // add 方法 ，添加新对象，返回boolean
    public boolean add(House newHouse){
        // 判断是否还能再添加 --> 需要用一个变量来确定当前房屋信息 houseNum
        // 扩容机制
        // houses = new House[houses.length + 1];  这句话可能把原来的数据给覆盖掉了
        // 使用临时变量去接收旧数组
        House[] temp = new House[houses.length * 2];
        for (int i = 0; i < houses.length; i++) {
            temp[i] = houses[i];
        }
        houses = temp; // 参考 csdn 的方法，扩建新数组后，把新数组的地址赋值给旧数组，即可实现对旧数组的扩容。
        if (houseNum == houses.length){
            System.out.println("数组已满，不能再添加...");
            return false;
        }
        houses[houseNum++] = newHouse; // 将newHouse添加到数组的最后面，然后houseNums增加
        newHouse.setId(++idCounter); // 设计id自增长机制并更新newHouse里面的id，这里newhouse是House类型，直接调用House的set方法完成设置
        return true;
    }
}
