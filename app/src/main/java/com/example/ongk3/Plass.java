package com.example.ongk3;

import java.io.Serializable;

public class Plass implements Serializable {
    private String name;
    private String price;
    private String category;
    private int img;

    public Plass(String name, String price, String category, int img) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.img = img;
    }

    public Plass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Plass{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                ", img=" + img +
                '}';
    }
}
