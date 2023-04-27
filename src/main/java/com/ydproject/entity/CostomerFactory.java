package com.ydproject.entity;

// Costomer类的静态工厂
public class CostomerFactory {
    private static Costomer costomer;

    static {
        costomer = new Costomer();
        costomer.setName("我是工厂类制造的客户");
        costomer.setDetails("被工厂生产出来的对象罢了");
    }
    private CostomerFactory(){}

    private static Costomer getCostomer(){
        return costomer;
    }
}
