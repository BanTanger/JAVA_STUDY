package com.bantanger.enum_;

enum Season {
    SPRING("春天","温暖"),
    WINTER("冬天","寒冷"),
    AUTUMN("秋天","凉爽"),
    SUMMER("夏天","炎热");
    private String name;
    private String desc; // 描述

    // 构造器私有化 防止直接new创建对象
    // 饿汉式 在类里创建对象
    // 去除 set方法防止直接修改
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
