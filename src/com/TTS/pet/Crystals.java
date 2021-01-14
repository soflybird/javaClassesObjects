package com.TTS.pet;

public class Crystals {
    public String type;
    public String color;
    public int weight;
    public int price;

    public Crystals() {
        type = "type";
        color = "color";
        weight = 0;
        price = 0;
    }

    public Crystals(String type, String color, int weight, int price) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public Crystals(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void color(String color) {
        System.out.println("Your crystal is " + color);
    }

    @Override
    public String toString() {
        return "Crystals{" +
                "type='" + type + '\'' +
                "color=" + color + '\'' +
                "weight=" + weight +
                "prince=" + price + '}';

    }


    public boolean isOdd (int value) {
        boolean isOdd =  ((value % 2) > 0);
        return true;
    }

    public boolean isEven (int value) {
        boolean isEven = ((value % 2) > 0);
        return true;
    }
}



