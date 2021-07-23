package com.xiaochen.dao;

/**
 * @Author en
 * @Date 2021/7/2 20:07
 */
public class Orders {
    private String oname;
    private String oaddress;

    public Orders(String oname, String oaddress) {
        this.oname = oname;
        this.oaddress = oaddress;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                ", oaddress='" + oaddress + '\'' +
                '}';
    }
}
