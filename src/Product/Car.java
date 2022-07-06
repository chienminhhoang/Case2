package Product;

import java.io.Serializable;

public class Car extends Transport {
    private String address;
    private String gearbox;
    private int window;
    private int km;

    public Car() {
    }



    public Car(int id, String name, String color, int date, int price, Brand brand, String condition, String vehicles, String address, String gearbox, int window, int km) {
        super(id, name, color, date, price, brand, condition, vehicles);
        this.address = address;
        this.gearbox = gearbox;
        this.window = window;
        this.km = km;
    }
    //    public Car(int id, String name, String color, int date, Brand brand, String condition, String vehicles, String address, String gearbox, int window, int km) {
//        super(id, name, color, date, brand, condition, vehicles);
//        this.address = address;
//        this.gearbox = gearbox;
//        this.window = window;
//        this.km = km;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Car{" +
                "address='" + address + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", window=" + window +
                ", km=" + km +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", brand=" + brand +
                ", condition='" + condition + '\'' +
                ", vehicles='" + vehicles + '\'' +
                '}';
    }
}
