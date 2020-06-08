package com.prasanth.mvcexample.model;

public class Student {

    public int sid;

    public String college;

    public String city;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", college='" + college + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
