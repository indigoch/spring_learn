package com.xiaochen.内部bean;

/**
 * @Author en
 * @Date 2021/7/2 21:16
 */
public class Emp {
    private String ename;
    private String gender;

    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }

}
