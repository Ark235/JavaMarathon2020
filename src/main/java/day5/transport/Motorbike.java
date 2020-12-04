package day5.transport;

public class Motorbike {

    int prodYear;
    String color;
    String model;

    public Motorbike(int prodYear, String color, String model) {
        this.prodYear = prodYear;
        this.color = color;
        this.model = model;
    }

    public int getProdYear() {
        return prodYear;
    }
    public String getCarColor() {
        return color;
    }
    public String getCarModel() {
        return model;
    }
}
