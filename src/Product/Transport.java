package Product;
public class Transport {
    private int id;
    private String name;
    private String color;
    private int date;
    private String brand;
    private String condition;
    private String vehicles;

    public Transport() {
    }

    public Transport(int id, String name, String color, int date, String brand, String condition, String vehicles) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.date = date;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
