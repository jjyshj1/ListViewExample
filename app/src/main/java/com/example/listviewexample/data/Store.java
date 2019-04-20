package com.example.listviewexample.data;

public class Store {
    String name;
    //거리 : 가게좌표와 나의 좌표를 계산하는것이 원칙
    //double latitude;
    //double longitude;

    String address;
    String opentime;
    String closetime;


    public Store(String name, String address, String opentime, String closetime) {
        this.name = name;
        this.address = address;
        this.opentime = opentime;
        this.closetime = closetime;
    }
}
