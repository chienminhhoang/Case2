package Product;

import java.io.Serializable;

public class Transport implements Serializable {
    protected int id;
    protected String name;
    protected String color;
    protected int date;
    protected int price;
    protected Brand brand;
    protected String condition;
    protected String vehicles;

    public Transport() {
    }

    public Transport(int id, String name, String color, int date , int price , Brand brand, String condition, String vehicles) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.date = date;
        this.price =price;
        this.brand = brand;
        this.condition = condition;
        this.vehicles = vehicles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public  String getBrandName(){
        return brand.getName();
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getVehicles() {
        return vehicles;
    }

    public void setVehicles(String vehicles) {
        this.vehicles = vehicles;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", date=" + date +
                ", brand='" + brand + '\'' +
                ", condition='" + condition + '\'' +
                ", vehicles='" + vehicles + '\'' +
                '}';
    }
}
