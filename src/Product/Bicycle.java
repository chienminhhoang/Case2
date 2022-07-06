package Product;

public class Bicycle extends Transport {
    private int age;

    public Bicycle() {
    }

//    public Bicycle(int age) {
//        this.age = age;
//    }

    public Bicycle(int id, String name, String color, int date, int price, Brand brand, String condition, String vehicles, int age) {
        super(id, name, color, date, price, brand, condition, vehicles);
        this.age = age;
    }

//    public Bicycle(int id, String name, String color, int date, String brand, String condition, String vehicles, int age) {
//        super(id, name, color, date, brand, condition, vehicles);
//        this.age = age;
//    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "age=" + age +
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
