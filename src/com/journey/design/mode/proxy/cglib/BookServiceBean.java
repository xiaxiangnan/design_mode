package com.journey.design.mode.proxy.cglib;

/**
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-10-29.
 */
public class BookServiceBean {

    public void create() {
        System.out.println("create() is running !");
    }

    public void query() {
        System.out.println("query() is running !");
    }

    public void update() {
        System.out.println("update() is running !");
    }

    public void delete() {
        System.out.println("delete() is running !");
    }
}