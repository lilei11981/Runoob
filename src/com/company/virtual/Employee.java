package com.company.virtual;

/**
 * Created by lilei on 2017/6/30.
 *
 * 虚方法实例
 */

public class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(String name, String address, int number) {
//        System.out.println("Employee 构造函数");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("邮寄支票给：" + this.name + " " + this.address + " " + this.number);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}
