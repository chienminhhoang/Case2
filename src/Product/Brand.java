package Product;

import java.io.Serializable;

public class Brand implements Serializable {
    private String name;

    public Brand(String brand) {
        this.name = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                '}';
    }
}
