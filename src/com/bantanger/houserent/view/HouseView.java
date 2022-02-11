package com.bantanger.houserent.view;

import com.bantanger.houserent.domain.House;
import com.bantanger.houserent.service.HouseService;
import com.bantanger.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true; // 控制显示菜单
    private char key = ' '; // 接收用户选择
    private HouseService houseService = new HouseService(2);//设置数组的大小为2

    // 完成退出确认
    public void exit(){
        // Utility 提供的方法，完成确认
        char choice = Utility.readConfirmSelection();
        if ( choice == 'Y'){
            loop = false;
        }
    }
    // ReviseHouse()
    public void Revisehouse(){
        System.out.println("==========修改房屋信息==========");
        System.out.print("请输入待修改的房屋编号id (-1退出)");
        int reviseId = Utility.readInt();
        // 通过find方法得到每一个数据。
        if (reviseId == -1){
            System.out.println("==========放弃修改房屋信息==========");
            return;
        }
        House house = houseService.find(reviseId);// 返回的是House数组，引用类型，这里修改对应数组也被修改
        if (house == null){
            System.out.println("==========修改房屋信息id不存在...==========");
        }
        System.out.println("姓名("+house.getName()+")");
        String name = Utility.readString(8,"");//若用户直接回车 ”“代表默认值
        if (!"".equals(name)){
            house.setName(name);
        }
        System.out.println("电话("+house.getPhone()+")");
        String phone = Utility.readString(12,"");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.println("地址("+house.getAddress()+")");
        String address = Utility.readString(16,"");
        if (!"".equals(address)){
            house.setPhone(address);
        }
        System.out.println("租金("+house.getRent()+")");
        int rent = Utility.readInt(-1);// 如果直接回车，返回-1
        if (rent != -1){
            house.setPhone(address);
        }
        System.out.println("状态("+house.getState()+")");
        String state = Utility.readString(3,"");
        if (!"".equals(state)){
            house.setPhone(state);
        }
    }
    // FindHouse() 接收输入的id
    public void FindHouse(){
        System.out.println("==========查找房屋信息==========");
        System.out.print("请输入待查找的房屋编号id");
        int findId = Utility.readInt();
        House house = houseService.find(findId);
        if (house != null){
            System.out.println(house);
        }else{
            System.out.println("==========查找房屋信息id不存在==========");
        }
    }
    // DelHouse() 接收输入的id 调用Service 的 del方法
    public void DelHouse() {
        System.out.println("==========删除房屋信息==========");
        System.out.print("请输入待删除的房屋编号id (-1退出)");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("=========放弃删除房屋信息=========");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            // 真的删除房屋信息
            if (houseService.del(delId)){
                System.out.println("=========删除房屋信息成功=========");
            }else{
                System.out.println("=========房屋编号不存在，删除失败=========");
            }
        }else{
            System.out.println("=========放弃删除房屋信息=========");
            // 二次确认
        }
    }
    // AddHouse() 接收输入 创建House对象 调用add方法
    public void AddHouse(){
        System.out.println("==========添加房屋信息==========");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);
        // 创建一个新的House对象 注意id是系统分配，自动增长
        House newhouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newhouse)){
            System.out.println("===========添加房屋成功===========");
        }else{
            System.out.println("===========添加房屋失败===========");
        }
    }

    // ListHouse() 接收房屋列表的方法
    public void ListHouse(){
        System.out.println("===========房屋列表===========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(出租/未出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
    }
    // 显示主菜单
    public void mainMenu(){
        do{
            System.out.println("\n===========房屋出租系统菜单===========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 源 信 息");
            System.out.println("\t\t\t4 修 改 房 源 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入选择(1-6):");
            key = Utility.readChar();
            switch (key){
                case '1':
                    AddHouse();
                    break;
                case '2':
                    FindHouse();
                    break;
                case '3':
                    DelHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    ListHouse();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("数据输入错误 选择范围为(1-6)");
            }
        }while(loop);
    }
}
