package Product;

import Product.Transport;

public class MotoBike extends Transport {
    private String CubicCentimetre;

    public MotoBike() {
    }

    public MotoBike(String cubicCentimetre) {
        CubicCentimetre = cubicCentimetre;
    }

    public MotoBike(int id, String name, String color, int date, String brand, String condition, String vehicles, String cubicCentimetre) {
        super(id, name, color, date, brand, condition, vehicles);
        CubicCentimetre = cubicCentimetre;
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
                '}';
    }
}
