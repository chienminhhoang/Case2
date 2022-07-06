package Product;

public class MotoBike extends Transport {
    private String CubicCentimetre;


    public MotoBike(String cubicCentimetre) {
        CubicCentimetre = cubicCentimetre;
    }

    public MotoBike(int id, String name, String color, int date, int price, Brand brand, String condition, String vehicles, String cubicCentimetre) {
        super(id, name, color, date ,price,  brand, condition, vehicles);
        this.CubicCentimetre = cubicCentimetre;
    }

    public String getCubicCentimetre() {
        return CubicCentimetre;
    }

    public void setCubicCentimetre(String cubicCentimetre) {
        CubicCentimetre = cubicCentimetre;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "CubicCentimetre='" + CubicCentimetre + '\'' +
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
