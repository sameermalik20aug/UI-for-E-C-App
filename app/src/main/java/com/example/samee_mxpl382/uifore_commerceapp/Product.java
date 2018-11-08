package com.example.samee_mxpl382.uifore_commerceapp;

public class Product {
    String img;
    String ptitle;
    int price;
    String desc;

    public Product(String img, String ptitle, int price, String desc) {
        this.img = img;
        this.ptitle = ptitle;
        this.price = price;
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
