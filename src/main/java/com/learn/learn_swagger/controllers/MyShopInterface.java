package com.learn.learn_swagger.controllers;


public class MyShopInterface implements com.learn.learn_swagger.models.MyShopInterface {
    private String shopName;

    private Integer id;


    @Override
    public String getShopName() {
        return shopName;
    }

    @Override
    public int getShopId() {
        return id;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
