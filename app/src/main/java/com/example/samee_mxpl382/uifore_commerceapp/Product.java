package com.example.samee_mxpl382.uifore_commerceapp;

public class Product {
    String img;
    String ptitle;
    int price;

    public Product(String img, String ptitle, int price) {
        this.img = img;
        this.ptitle = ptitle;
        this.price = price;
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
}
